<%-- 
    Document   : contract
    Created on : Nov 10, 2013, 11:50:19 PM
    Author     : paul kulitski
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<h2>Contact Manager</h2>
<form:form method="post" action="addContact.html">

    <table>
        <tr>
            <td><form:label path="firstname">First Name</form:label></td>
            <td><form:input path="firstname" /></td> 
        </tr>
        <tr>
            <td><form:label path="lastname">Last Name</form:label></td>
            <td><form:input path="lastname" /></td>
        </tr>
        <tr>
            <td><form:label path="lastname">Email</form:label></td>
            <td><form:input path="email" /></td>
        </tr>
        <tr>
            <td><form:label path="lastname">Telephone</form:label></td>
            <td><form:input path="telephone" /></td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="Add Contact"/>
            </td>
        </tr>
    </table>	

</form:form>

