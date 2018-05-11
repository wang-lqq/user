package user.management.util;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
@Component
public class PageBean {
	private int pageSize;//每页显示几条数据
	private int pageNow;//当前是第几页,默认第一页
	private int rowCount;//总有多少条记录
	private int pageCount;//总共有几页
	private List dataList;//放所有分页的数据
	//是oracle分页需要的
	private int startRow;//开始行数
	private int endRow;//结束行数
	
	//构造方法
	public PageBean(){
		//初始化默认每页显示数量
		pageSize = 3;
		//实例化集合
		dataList = new ArrayList();
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getPageNow() {
		return pageNow;
	}

	//设置pageNow的值，并且给pageNow做限制
	public void setPageNow(int pageNow) { //-1
		//限制如果是第一页，就不能再往上翻了。
		//如果是最后一页，就不能再往下翻了。
		if(pageNow<1){
			pageNow = 1;
		}else if(pageNow>pageCount){
			pageNow=pageCount;
		}
		this.pageNow = pageNow;
	}

	public int getRowCount() {
		return rowCount;
	}

	//设置总共有多少条记录，并且得到总共有多少页
	public void setRowCount(int rowCount) {
		this.rowCount = rowCount;
		//总共有几页
		if(rowCount%pageSize==0){
			pageCount = rowCount/pageSize;
		}else{
			pageCount = rowCount/pageSize + 1;
		}
	}

	public int getPageCount() {
		return pageCount;
	}

	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}

	public List getDataList() {
		return dataList;
	}

	public void setDataList(List dataList) {
		this.dataList = dataList;
	}

	//得到开始行数
	public int getStartRow() {
		return (pageNow-1)*pageSize;
	}

	public void setStartRow(int startRow) {
		this.startRow = startRow;
	}

	//得到结束行数
	public int getEndRow() {
		return pageSize;
	}

	public void setEndRow(int endRow) {
		this.endRow = endRow;
	}

	@Override
	public String toString() {
		return "PageBean [pageSize=" + pageSize + ", pageNow=" + pageNow + ", rowCount=" + rowCount + ", pageCount="
				+ pageCount + ", startRow=" + startRow + ", endRow=" + endRow + "]";
	}
	
	
}
