<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="UTF-8">
        <title>JSP Page</title>
        
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"/>
   
    </head>
    <body>
        <div class="container">
            <div class="row">
                <h1>Ingrese sus datos</h1>
                
                <form:form method="post" commandName="persona">
                    
                    <form:errors path="*" element="div" cssClass="alert alert-danger"/>
                    
                    
                    <p>
                        <form:label path="docente">Docente</form:label>
                        <form:input path="docente" cssClass="form-control"/>
                        <form:errors path="docente"/>
                    </p>
                    
                    <p>
                        <form:label path="s_academico">Semestre academico</form:label>
                        <form:input path="s_academico" cssClass="form-control"/>
                    </p>
                    
                    <p>
                        <form:label path="horas_semanales">Numero de horas</form:label>
                        <form:select path="horas_semanales" cssClass="form-control">
                            <form:option value="0">Seleccione</form:option>
                            <form:options items="${N_horas}"/>
                        </form:select>
                    </p>
                    
                    <hr/>
                    
                    <input type="submit" value="Enviar" class="form-control"/>
                    
                    
                </form:form>
                
            </div>
        </div>
    </body>
</html>
