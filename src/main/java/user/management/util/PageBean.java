package user.management.util;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
@Component
public class PageBean {
	private int pageSize;//ÿҳ��ʾ��������
	private int pageNow;//��ǰ�ǵڼ�ҳ,Ĭ�ϵ�һҳ
	private int rowCount;//���ж�������¼
	private int pageCount;//�ܹ��м�ҳ
	private List dataList;//�����з�ҳ������
	//��oracle��ҳ��Ҫ��
	private int startRow;//��ʼ����
	private int endRow;//��������
	
	//���췽��
	public PageBean(){
		//��ʼ��Ĭ��ÿҳ��ʾ����
		pageSize = 3;
		//ʵ��������
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

	//����pageNow��ֵ�����Ҹ�pageNow������
	public void setPageNow(int pageNow) { //-1
		//��������ǵ�һҳ���Ͳ��������Ϸ��ˡ�
		//��������һҳ���Ͳ��������·��ˡ�
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

	//�����ܹ��ж�������¼�����ҵõ��ܹ��ж���ҳ
	public void setRowCount(int rowCount) {
		this.rowCount = rowCount;
		//�ܹ��м�ҳ
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

	//�õ���ʼ����
	public int getStartRow() {
		return (pageNow-1)*pageSize;
	}

	public void setStartRow(int startRow) {
		this.startRow = startRow;
	}

	//�õ���������
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
