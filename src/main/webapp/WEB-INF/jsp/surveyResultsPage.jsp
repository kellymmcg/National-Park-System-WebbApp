<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:import url="/WEB-INF/jsp/header.jsp" />
<h2>Take our daily survey!</h2>

<c:url var="formAction" value="/dailySurvey" />
<form method="GET" action="${formAction}">
	<div class="formInputGroup">
		<label for="email">E-Mail Addresss:</label> 
		<input type="text" name="email" id="email" />
	</div>
	<div class="formInputGroup">
		<label for="nationalPark">Please Choose Your Favorite National Park</label> 
		<select name="nationalPark"	id="nationalPark">
			<option value="GNP">Glacier National Park</option>
			<option value="GCNP">Grand Canyon National Park</option>
			<option value="GTNP">Grand Teton National Park</option>
			<option value="MRNP">Mount Ranier National Park</option>
			<option value="GSMNP">Great Smoky Mountain National Park</option>
			<option value="ENP">Everglades National Park</option>
			<option value="YNP">Yellowstone National Park</option>
			<option value="YNP2">Yosemite National Park</option>
			<option value="CVNP">Cuyahoga Valley National Park</option>
			<option value="RMNP">Rocky Mountain National Park</option>
			
		
		</select>
	</div>
	<div class="formInputGroup">
		<label for="rate">Interest Rate:</label> 
		<input type="text" name="rate" id="rate" />
	</div>
	<input class="formSubmitButton" type="submit" value="Calculate Payment" />
</form>


<c:import url="/WEB-INF/jsp/footer.jsp" />