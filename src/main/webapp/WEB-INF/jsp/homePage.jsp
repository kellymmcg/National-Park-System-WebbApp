<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:import url="/WEB-INF/jsp/header.jsp" />
<div class="background"></div>
	
		<c:forEach var="park" items="${park}">
		<div class="one">
		<c:url value="/parkDetails" var="parkDetailsURL">
				<c:param name="parkCode" value="${park.parkCode}" />
			</c:url><br><br><br><br>
		<div class="parkimage">	
			<c:url var="imagesrc" value="img/parks/${park.parkCodeLowerCase}.jpg" />
			<img src="${imagesrc}" >
		</div>	
			
		<div class ="parkstatecodedescription">
			<b> ${park.parkCode}</b><br>
			<a href="${parkDetailsURL}">
			<b>${park.parkName}, ${park.state}</b></a>
			<p>${park.description}</p>
		</div>
		</div>
		</c:forEach>


<c:import url="/WEB-INF/jsp/footer.jsp" />