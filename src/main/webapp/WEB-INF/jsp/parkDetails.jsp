<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:import url="/WEB-INF/jsp/header.jsp" />


<strong><h2>${park.parkName}</h2></strong><br>
<c:url var="imagesrc" value="img/parks/${park.parkCodeLowerCase}.jpg" />
		<img src="${imagesrc}" width="50%" height="50%">
<br>
${park.quote}<br>
${park.quoteSource}<br>
<aside>
<p>
		The ${park.parkName} is located in the state of ${park.state} and was founded in ${park.yearFounded}.  The total accreage is
		${park.acreage} with an elevation of ${park.elevation}, and a total of ${park.milesOfTrail} miles
		of trails meanandering through this National Park.  You can see upwards of ${park.numberOfAnimalSpecies} animal species 
		in a climate that can be described as ${park.climate}.  </p>
		<p>
		 <ul>
		 <li>Number of Campsites:  ${park.numberOfCampsites}</li>
		 <li>Entry Fee: $ ${park.entryFee}</li>
		 
		 </ul>  
		
	
	<br>

</aside>


<c:import url="/WEB-INF/jsp/footer.jsp" />
