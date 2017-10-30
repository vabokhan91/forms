<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">

    <title>Create new form</title>
<#include "scripts.ftl"/>
</head>

<body>

<#include "header.ftl"/>

<main role="main" class="container">

    <div class="row row-offcanvas row-offcanvas-right" style="margin-top: 80px">

        <div class="col-12 col-md-9">
            <p class="float-right d-md-none">
                <button type="button" class="btn btn-primary btn-sm" data-toggle="offcanvas">Toggle nav</button>
            </p>
                <div class="jumbotron">
                    <h1>Create new form</h1>
                </div>
            <div class="col-6">
                <form id="add-question-form" method="POST" action="/save-form">
                    <div class="form-group">
                        <input type="text" class="form-control" placeholder="Form name" name="formName">
                    </div>
                    <div class="horizontal-line"></div>

                    <div class="form-group">
                        <input type="text" class="form-control" placeholder="Question" name="formQuestion">
                    </div>

                    <div class="horizontal-line"></div>
                    <div class="form-group answer-input" id="add-form-answer-container1">
                        <input type="text" class="form-control" id="add-form-answer1" placeholder="first answer" name="answer1">
                    </div>
                    <div class="form-group answer-input" id="add-form-answer-container2">
                        <input type="text" class="form-control" id="add-form-answer2" placeholder="second answer" name="answer2">
                    </div>
                    <div class="form-group answer-input" id="add-form-answer-container3">
                        <input type="text" class="form-control" id="add-form-answer3" placeholder="third answer" name="answer3">
                    </div>
                    <div id="add-form-save-form-button" class="add-form-submit-button-container">
                        <input type="submit" value="Save form" class="btn"/>
                    </div>
                </form>
            </div>
        </div>

        <div class="col-6 col-md-3 sidebar-offcanvas" id="sidebar">
            <div class="list-group">
                <a href="/forms" class="list-group-item">View forms</a>
                <a href="/create-form" class="list-group-item">Create new form</a>

            </div>
        </div>
    </div>

</main>
</body>
</html>