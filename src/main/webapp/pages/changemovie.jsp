<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>

<html:html>
<head>
<title>Change Movie Information</title>
</head>
<body>
<h2>Change Movie Information</h2>

<html:form action="UpdateDeleteMovie">

<table border="0" cellspacing="0" cellpadding="1">
<tr>
  <td align="right">Movie Name:</td>
  <td><html:text property="name"/></td>
</tr>
<tr>
  <td align="right">Movie Rating:</td>
  <td><html:select property="rating">
        <html:options collection="movieRatings" property="id" labelProperty="description"/>
      </html:select>
  </td>
</tr>
<tr>
  <td align="right">Worth Seeing Again?</td>
  <td><html:checkbox property="worthSeeingAgain"/></td>
</tr>
<tr>
  <td align="right">Scale (1 - 10):</td>
  <td><html:text property="scale"/></td>
</tr>
<tr>
  <td align="right">Comment:</td>
  <td><html:text property="comment"/></td>
</tr>
</table>

<html:hidden property="id"/>

<html:submit property="save" value="Save"/>
<html:submit property="delete" value="Delete"/>
</html:form>

<html:link page="/do/DisplayMovies">Cancel</html:link>
<html:link page="/do/Logon">Logoff</html:link>

<html:errors/>

</body>
</html:html>
