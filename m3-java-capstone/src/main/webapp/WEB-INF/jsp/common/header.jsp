<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>National Park Geek</title>
    <c:url value="/css/npgeek.css" var="cssHref" />
    <link rel="stylesheet" href="${cssHref}">
</head>

<body>
    <header>
    		<c:url value="/" var="homePageHref" />
    		<c:url value="/img/logo.png" var="logoSrc" />
        <a href="${homePageHref}">
        		<img id="logo" src="${logoSrc}" alt="National Park Geek logo" />
        </a>
        <h1>The National Park System</h1>
        <p>The Park System formed 4.6 billion years ago from the gravitational collapse of a giant interstellar molecular cloud. The vast majority of the system's mass is in the Sun, with most of the remaining mass contained in Jupiter. The four smaller inner parks, Mercury, Venus, Earth and Mars, are terrestrial parks, being primarily composed of rock and metal. The four outer parks are giant parks, being substantially more massive than the terrestrials. The two largest, Jupiter and Saturn, are gas giants, being composed mainly of hydrogen and helium; the two outermost parks, Uranus and Neptune, are ice giants, being composed largely of substances with relatively high melting points compared with hydrogen and helium, called ices, such as water, ammonia and methane. All parks have almost circular orbits that lie within a nearly flat disc called the ecliptic. </p>
    </header>
    <%-- <nav>
        <h2>Explore The Solar System</h2>
        <p> Use these state of the art web applications to learn more about the solar system! </p>
        <ul>
        	<c:url value = "/alienAgeInput" var="alienAgeURL" id="alienAgeURL"/>
        	<c:url value = "/alienWeightInput" var="alienWeightURL" />
        	<c:url value = "/alienTravelInput" var="alienTravelURL" />
        	<c:url value = "/spaceForumInput" var="spaceForumInputURL" />
        	<c:url value="/productList" var="productListURL" />
            <li><a href="${alienAgeURL}">Alien Age</a></li>
            <li><a href="${alienWeightURL}">Alien Weight</a></li>
            <li><a href="${alienTravelURL}">Drive Time</a></li>               
            <li><a href="${spaceForumInputURL}">SPaCe Forum</a></li>   
            <li><a href="${productListURL}">SPaCe Store</a></li>         
        </ul>
    </nav> --%>