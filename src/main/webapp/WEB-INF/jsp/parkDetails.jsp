<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:import url="/WEB-INF/jsp/header.jsp" />


<br>
<b><center><font size="36">${park.parkCode}: The ${park.parkName} </h1></center></font></b>
	<div class="quote">
	${park.quote}
	<br>
	${park.quoteSource}
	</div>
	<div class="parkimage">
		<c:url var="imagesrc" value="img/parks/${park.parkCodeLowerCase}.jpg" />
			<img src="${imagesrc}">
	</div>
	<div class="parkdetails">
		<p>The ${park.parkName} is located in the state of ${park.state} and
		was founded in ${park.yearFounded}. The total accreage is
		${park.acreage} with an elevation of ${park.elevation} feet, and a total of
		${park.milesOfTrail} miles of trails meandering through this National
		Park. You can see upwards of ${park.numberOfAnimalSpecies} animal
		species in a climate that can be described as ${park.climate}.  The entry fee
		into this park is $${park.entryFee} and the ${park.parkName} has a total of ${park.numberOfCampsites} campsites. </p>
		<p>${park.description}</p>
	</div>
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
	
	<c:choose>
		<c:when test="${Temp == 'Fahrenheit'}">
			<table>
				<tr>
					<c:forEach var="weather" items="${weather}">
					<td><h2>${weather.dayOfWeek}</h2></td>	
					</c:forEach>
				</tr>
				<tr>
					<c:forEach var="weather" items="${weather}">
					<c:url var="forecastImage" value="img/weather/${weather.forecast}.png" />	
					<td><img src="${forecastImage}" height="50%" width="50%"/></td>
					</c:forEach>
				</tr>
				<tr>
					<c:forEach var="forecast" items="${weather}">
					<td><h2>${forecast.forecast}</h2></td>	
					</c:forEach>
				</tr>
				<tr>
					<c:forEach var="weather" items="${weather}">
					<td><p>High: ${weather.high} &deg;F</p>
						<p>Low: ${weather.low} &deg;F</p>
					</td>	
					</c:forEach>
				</tr>
			</table>
		</c:when>
	</c:choose>
	
	<c:choose>
		<c:when test="${Temp == 'Celsius'}">
			<table>
				<tr>
					<c:forEach var="weather" items="${weather}">
					<td><h2>${weather.dayOfWeek}</h2></td>	
					</c:forEach>
				</tr>
				<tr>
					<c:forEach var="weather" items="${weather}">
					<c:url var="forecastImage" value="img/weather/${weather.forecast}.png" />	
					<td><img src="${forecastImage}" height="50%" width="50%"/></td>
					</c:forEach>
				</tr>
				<tr>
					<c:forEach var="forecast" items="${weather}">
					<td><h2>${forecast.forecast}</h2></td>	
					</c:forEach>
				</tr>
				<tr>
					<c:forEach var="weather" items="${weather}">
					<td><p>High: ${weather.highInCelsius} &deg;C</p>
						<p>Low: ${weather.lowInCelsius} &deg;C</p>
					</td>	
					</c:forEach>
				</tr>
			</table>
		</c:when>
	</c:choose>
	<b>
	<div class="iftest">
		<c:if test = "${weather.get(0).forecast == snow}">
			<p>It will be snowy today, please pack snow shoes.</p></c:if>
		<c:if test = "${weather.get(0).forecast == rain}">
			<p>It will rain today, please pack rain gear and waterproof shoes.</p></c:if>
		<c:if test = "${weather.get(0).forecast == thunderstorms}">
			<p>There will be thunderstorms today, please seek shelter and avoid high ridges.</p></c:if>
		<c:if test = "${weather.get(0).forecast == sunny}">
			<p>It will be sunny today, please pack sunblock.</p></c:if>	
		<c:if test = "${weather.get(0).high > 75}">
			<p>It will be hot today, please pack an extra gallon of water.</p></c:if>
		<c:if test = "${weather.get(0).high - weather.get(0).low >= 20}">
			<p>There will be a large difference between the high and low temperatures today, please be sure to wear breathable layers!</p></c:if>
		<c:if test = "${weather.get(0).high - weather.get(0).low <= 20}">
			<p>It will be very cold today, please take precautionary measures.</p></c:if>
		</b>
	</div>
</div>


<c:import url="/WEB-INF/jsp/footer.jsp" />
