<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:import url="/WEB-INF/jsp/common/header.jsp" />

<p id="surveyThanks"> THANK YOU FOR YOUR SUBMISSION! </p>

<div id="winnerBlock"><span id="winnerIs"> And the Winner is: </span><span id="winner">${winner.parkName}!</span></div>

<c:url var="winnerImgSrc" value="/img/${winPic}.jpg" />
<img id="winnerImg" src="${winnerImgSrc}" alt="Hooray!" >