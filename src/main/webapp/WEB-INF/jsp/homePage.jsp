<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:import url="/WEB-INF/jsp/header.jsp" />

<c:forEach var="park" items="${park}">
	
	<c:url value="/parkDetails" var="parkDetailsURL">
			<c:param name="parkCode" value="${park.parkCode}" />
		</c:url>
	<a href="${parkDetailsURL}">	
		<c:url var="imagesrc" value="img/parks/${park.parkCodeLowerCase}.jpg" />
		<img src="${imagesrc}" width="50%" height="50%">
	</a>	
	<p>${park.parkName}</p>
	<p>${park.state}</p> 
	<p>${park.description}</p>

</c:forEach>


<c:import url="/WEB-INF/jsp/footer.jsp" />