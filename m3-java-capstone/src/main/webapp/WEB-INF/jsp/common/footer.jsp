<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<div class="headerGap"></div>
<div id="footerBar">
	<c:url value="/img/nps.png" var="npsSrc" />
	<img id="npsLogo" src="${npsSrc}" alt="Don't sue us">
	<div id="director">
		<div>
		<p>Sham Goatman</p>
		<p>Director of NPG</p>
		</div>
		<c:url value="/img/director.png" var="directorSrc" />
		<img id="directorImg" src="${directorSrc}" alt="Bhaaaa">
	</div>
</div>