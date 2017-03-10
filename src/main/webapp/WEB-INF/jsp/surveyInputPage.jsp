<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:import url="/WEB-INF/jsp/header.jsp" />

<div class="survey"></div>
<h2>Take our daily survey!</h2>

	<c:url var="formAction" value="/surveyInputPage" />
	<form method="POST" action="${formAction}">
		<div class="emailAddress">
			<label for="emailAddress">E-Mail Addresss:</label> <input type="text"
				name="emailAddress" id="emailAddress" />
			</div>
		<div class="activity">
				<label for="activityLevel">Please Choose Your Activity Level</label>
				<select name="activityLevel" id="activityLevel">
					<option value="active">Active</option>
					<option value="extremelyActive">Extremely Active</option>
					<option value="inactive">Inactive</option>
					<option value="sedentary">Sedentary</option>
				</select>
		</div>
		<div class="parkCode">
			<label for="parkCode">Please Choose Your Favorite National
				Park</label> <select name="parkCode" id="parkCode">
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
		<div class="state">
			<label for="state">Please Choose Your State</label> <select
				name="state" id="state">
				<option value="NA">Not Applicable</option>
				<option value="AL">Alabama</option>
				<option value="AK">Alaska</option>
				<option value="AZ">Arizona</option>
				<option value="AR">Arkansas</option>
				<option value="CA">California</option>
				<option value="CO">Colorado</option>
				<option value="CT">Connecticut</option>
				<option value="DE">Delaware</option>
				<option value="DC">District Of Columbia</option>
				<option value="FL">Florida</option>
				<option value="GA">Georgia</option>
				<option value="HI">Hawaii</option>
				<option value="ID">Idaho</option>
				<option value="IL">Illinois</option>
				<option value="IN">Indiana</option>
				<option value="IA">Iowa</option>
				<option value="KS">Kansas</option>
				<option value="KY">Kentucky</option>
				<option value="LA">Louisiana</option>
				<option value="ME">Maine</option>
				<option value="MD">Maryland</option>
				<option value="MA">Massachusetts</option>
				<option value="MI">Michigan</option>
				<option value="MN">Minnesota</option>
				<option value="MS">Mississippi</option>
				<option value="MO">Missouri</option>
				<option value="MT">Montana</option>
				<option value="NE">Nebraska</option>
				<option value="NV">Nevada</option>
				<option value="NH">New Hampshire</option>
				<option value="NJ">New Jersey</option>
				<option value="NM">New Mexico</option>
				<option value="NY">New York</option>
				<option value="NC">North Carolina</option>
				<option value="ND">North Dakota</option>
				<option value="OH">Ohio</option>
				<option value="OK">Oklahoma</option>
				<option value="OR">Oregon</option>
				<option value="PA">Pennsylvania</option>
				<option value="RI">Rhode Island</option>
				<option value="SC">South Carolina</option>
				<option value="SD">South Dakota</option>
				<option value="TN">Tennessee</option>
				<option value="TX">Texas</option>
				<option value="UT">Utah</option>
				<option value="VT">Vermont</option>
				<option value="VA">Virginia</option>
				<option value="WA">Washington</option>
				<option value="WV">West Virginia</option>
				<option value="WI">Wisconsin</option>
				<option value="WY">Wyoming</option>
	
			</select> <input class="formSubmitButton" type="submit"
				value="Submit" />
	</div>
</div>
</form>


<c:import url="/WEB-INF/jsp/footer.jsp" />