package practicejsp;

public class Paging {

/*<%
		 if (count > 0) {
			 int pageBlock = 3;	//페이징 출력 갯수
			 int imsi = count % pageSize == 0 ? 0 : 1;	//쩌리 페이지 있는지 확인
			 int pageCount = count / pageSize + imsi;	//총 페이징 갯수
			 int startPage = (int)((currentPage-1)/pageBlock)*pageBlock + 1;	//페이징 최소값
			 int endPage = startPage + pageBlock - 1;	//페이징 최대값
			 if (endPage > pageCount) endPage = pageCount;	//페이징 갯수가 5보다 작을 때
			 if (startPage > pageBlock) { %>
			 	<a href="list.jsp?pageNum=<%=startPage-pageBlock%>">[이전]</a>
			<%
			 }
			 for (int i = startPage ; i <= endPage ; i++) { %>
				 <%if(i==currentPage){ %>
				 	[<%= i %>]
				 <%}else{ %>
				 	<a href="list.jsp?pageNum=<%= i %>" style="color:blue">[<%= i %>]</a>
				 <%} %>
			<%
			 }
			 if (endPage < pageCount) { %>
			 	<a href="list.jsp?pageNum=<%=startPage+pageBlock%>">[다음]</a>
			<%
			 }
		 }
		%>
 * 
 * */
	
}
