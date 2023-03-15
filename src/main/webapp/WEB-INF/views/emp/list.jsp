<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script src="/js/emp/list.js"></script>
</head>
<body>
<header>
	<div>
		<div>
			<input type="button" id="btn_all" value="전체조회">
		</div>
	</div>
</header>
<section>
	<div>
		<div>
			<form action="/emp/checkedList.do">
				<input type="submit" value="선택된 것만 조회">
				<hr>
				<table border=1>
					<thead>
						<tr>
							<th>선택</th>
							<th>empno</th>
							<th>ename</th>
							<th>sal</th>
							<th>mgr</th>
							<th>deptno</th>
							<th>dname</th>
							<th>loc</th>
						</tr>
					</thead>
					<tbody id="tbody">
						<c:if test="${ not empty list }">
							<c:forEach var="dto" items="${list }">
								<tr>
									<td><input type="checkbox" name="chk" value="${dto.empno}"></td>
									<td>${dto.empno}</td>
									<td>${dto.ename}</td>
									<td>${dto.sal}</td>
									<td>${dto.mgr}</td>
									<td>${dto.deptno}</td>
									<td>${dto.dname}</td>
									<td>${dto.loc}</td>
								</tr>
							</c:forEach>
						</c:if>
						<c:if test="${ empty list }">
							<tr>
								<td colspan="7" style="text-align:center;">조회된 데이터가 없습니다</td>
							</tr>
						</c:if>
					</tbody>
				</table>
			</form>
		</div>
	</div>
</section>

</body>
</html>