<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<%@ page trimDirectiveWhitespaces="true" %>

<% 

	//ajaxData.jsp 

	request.setCharacterEncoding("euc-kr");
	String name = request.getParameter("name");
	String orderNum = request.getParameter("orderNum");
	
	System.out.println("name : " + name );
	System.out.println("orderNum : " + orderNum );
	
	String status = "";
	
	if( name.equals("admin") && orderNum.equals("A001") ) {
		status = "�ֹ��Ͻ� �ݱ��� ���� �߼� �� �Դϴ�.";
	} else if(  name.equals("admin") && orderNum.equals("A002") ) {
		status = "�ֹ��Ͻ� �ڵ����� ���忡�� ������ �Ϸ� �Ǿ����ϴ�.";
	} else {
		status = "�̹� �߼۵� ��ǰ �Դϴ�.";
	}
%>
<%= status %>






