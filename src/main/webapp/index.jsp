<%@page import="media.testjenkins.MathClass"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%
        MathClass math = new MathClass();
        String so1 = "";
        String so2 = "";
        String ketqua = "";
        so1 = (request.getParameter("so1") == null) ? "0" : request.getParameter("so1");
        so2 = (request.getParameter("so2") == null) ? "0" : request.getParameter("so2");
        ketqua = String.valueOf(math.plus(Integer.parseInt(so1), Integer.parseInt(so2)));
    %>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form name="math" action="index.jsp" method="get">
            <table>
                <tr>
                    <td>Số 1</td>
                    <td><input value="<%=so1%>" id="so1" type="text" name="so1"/></td>
                    <td>Số 2</td>
                    <td><input value="<%=so2%>" id="so2" type="text" name="so2"/></td>
                </tr>
                <tr>
                    <td>&nbsp;</td>
                    <td>
                        <input type="submit" value="Cộng" />
                    </td>
                    <td>Kết quả</td>
                    <td><%=ketqua%></td>
                </tr>
            </table>
        </form>
    </body>
</html>
