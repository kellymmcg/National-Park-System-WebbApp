<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:import url="/WEB-INF/jsp/header.jsp" />

<h3>Thank you for taking our survey!</h3>
<p>Take a look at how your favorite park ranks amongst our site visitors</p>

<div>
	<table>
		<c:forEach var="survey" items="${surveys}">	
				<tr>
					<td>${survey.parkCount} Votes</td>
					<td>${survey.parkName}</td>
				</tr>
		</c:forEach>
	</table>
</div>

<c:import url="/WEB-INF/jsp/footer.jsp" />