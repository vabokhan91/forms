<!DOCTYPE html>
<html lang="en-US" prefix="form" xmlns="http://www.springframework.org/tags/form"
      xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
      xsi:schemaLocation="http://www.springframework.org/tags/form ">
<head>
    <meta charset="UTF-8">
    <title>Questions</title>
<#include "scripts.ftl"/>
</head>
<body>
<#include "header.ftl"/>

<div class="container">

    <div class="row row-offcanvas row-offcanvas-right" style="margin-top: 80px">

        <div class="col-9">

            <div class="blog-main">

                <div class="blog-post">
                    <h2 class="blog-post-title">${form.formName}</h2>

                    <form action="/check" commandName="user_answers" method="post">
                        <input type="hidden" name="formId" value="${form.id}"/>
                        <input type="hidden" name="formName" id="formName" value="${form.formName}"/>
                        <br/>
                        <div>
                        <#list form.questions as question>
                            <h4>${question.question}</h4>
                            <br/>
                            <div>
                                <#list question.answers as answer>
                                    <div>
                                        <label class="form-check-label">
                                            <input type="checkbox" path="user_answers"
                                                   value="${answer}">${answer.variant}
                                        </label>
                                    </div>
                                    <br/>
                                </#list>
                                <br/>
                                <hr/>
                            </div>
                            <br/>
                        </#list>
                        </div>
                        <input type="submit" value="Submit"/>
                    </form>
                </div>
            </div>
        </div>

        <div class="col-3" id="sidebar">
            <div class="list-group">
                <a href="/forms" class="list-group-item ">View forms</a>
                <a href="/create-form" class="list-group-item">Create new form</a>

            </div>
        </div>
    </div>
</div>
</body>
</html>