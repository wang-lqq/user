package user.management.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import user.management.entity.User;
import user.management.service.UserService;
import user.management.util.PageBean;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	UserService userService;
	
	@RequestMapping(value="/check",method=RequestMethod.POST)
	public String checkUser(String name,String pwd,Model model) {
		User user = userService.checkUser(name, pwd);
		if(user==null) {
			return "redirect:/user/login";
		}
		return "redirect:/user/main/1";
	}
	@RequestMapping("/login")
	public String login(Model model) {
		return "login";
	}
	
	@RequestMapping(value="/main/{pageNow}")
	public String display(@PathVariable("pageNow")int pageNow,String name,Model model) {
		PageBean pageBean = userService.userPaging(name,pageNow);
		model.addAttribute("pageBean",pageBean);
		return "main";
	}
	
	@RequestMapping(value="/delete")
	@ResponseBody
	public ModelMap deleteUser(@RequestBody int uuid,ModelMap model) {
		int deleteCount = userService.deleteUserById(uuid);
		model.addAttribute("deleteCount",deleteCount);
		return model;
	}
	
	@RequestMapping(value="/modify/{uuid}")
	public String modifyUser(@PathVariable("uuid")int uuid,Model model) {
		User user = userService.getUserById(uuid);
		model.addAttribute("user",user);
		return "modify";
	}
}
