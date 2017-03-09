<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:import url="/WEB-INF/jsp/header.jsp" />


<strong><h2>${park.parkName}</h2></strong>
<br>
<c:url var="imagesrc" value="img/parks/${park.parkCodeLowerCase}.jpg" />
<img src="${imagesrc}" width="50%" height="50%">
<br>
${park.quote}
<br>
${park.quoteSource}
<br>

<p>The ${park.parkName} is located in the state of ${park.state} and
	was founded in ${park.yearFounded}. The total accreage is
	${park.acreage} with an elevation of ${park.elevation}, and a total of
	${park.milesOfTrail} miles of trails meanandering through this National
	Park. You can see upwards of ${park.numberOfAnimalSpecies} animal
	species in a climate that can be described as ${park.climate}.</p>
<p>${park.description}</p>
<ul>
	<li>Number of Campsites: ${park.numberOfCampsites}</li>
	<li>Entry Fee: $ ${park.entryFee}</li>
</ul>

<div>
	<c:url value="/parkDetails" var="SubmitTempUrl" />
	<form action="${SubmitTempUrl}" method="GET">
		<input type="hidden" value="${park.parkCode}" name="parkCode"
			id="parkCode"> <select name="Temp">
			<option value="Celsius">Celsius</option>
			<option value="Fahrenheit" selected>Fahrenheit</option>
			<input type="submit" value="Submit">
		</select>
	</form>
	<table>
		<c:forEach var="weather" items="${weather}">
			<c:choose>
			<c:when test="${Temp == 'Fahrenheit'}">
				<tr>
					<td>${weather.dayOfWeek}</td>					
				</tr>
				<tr>
				<c:url var="forecastImage" value="img/weather/${weather.forecast}.png" />
				<td><img src="${forecastImage}" /></td>
				</tr>
				</c:when>
			</c:choose>
		</c:forEach>
	</table>
</div>


<c:import url="/WEB-INF/jsp/footer.jsp" />
