<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:import url="/WEB-INF/jsp/header.jsp" />

<c:forEach  var="park" items="${park}">
<p>${park.parkName}</p>

</c:forEach>

${park.parkName}
<c:import url="/WEB-INF/jsp/footer.jsp" />