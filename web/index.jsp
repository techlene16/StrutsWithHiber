<%-- 
    Document   : index
    Created on : Nov 18, 2015, 10:44:55 AM
    Author     : Vinay1
--%>
<%@taglib uri="/struts-tags" prefix="s"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Student Registration Form</h1>
        <s:form name="re" action="reg">
            <table >
                <tr><td><s:textfield name="regno" label="Registartion No"/></td>
                    <td><s:textfield name="name" label="Name"/></td></tr>
                <tr><td><s:textfield name="semail" label="Student Email"/></td>
                    <td><s:textfield name="smob" label="Mobile No"/></td></tr>
                <tr>
                    <td><s:submit value="Add" name="button"/></td>
                </tr>
            </table>
                   <s:hidden name="id"/>
                    <s:hidden name="pwd"/>
        </s:form>

        <%int i = 0;%>
        <s:if test="slist.size() > 0">
        <table border="1">
            <tr>
                <td>So</td>
                <td>Edit</td>
                <td>Delete</td>
                <td>Name</td>
                <td>Registration No</td>
                <td>Email Id</td>
                <td>Mobile No</td>
            </tr>
            <s:iterator value="slist">
                <tr>
                    <td><%=++i%></td>
                    <td><a href="reg.action?id=<s:property value="id"/>&aj=2"><img src="edit.png"  width="20" height="20" /></a></td>
                    <td><a href="reg.action?id=<s:property value="id"/>&aj=1"><img src="del.png"  width="20" height="20"/></a></td>
                    <td><s:property value="name"/></td>
                    <td><s:property value="regno"/></td>
                    <td><s:property value="semail"/></td>
                    <td><s:property value="smob"/></td>
                </tr>
            </s:iterator>
        </table>
        </s:if><s:else>
            No Records Found
        </s:else>
    </body>
</html>
