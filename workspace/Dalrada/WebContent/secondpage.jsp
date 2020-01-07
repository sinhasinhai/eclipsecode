<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class="container"><br />
		
		<div class="tab-content">
			
			<!--Ending of 1st navbar content-->




			<div id="menu2" class="tab-pane fade">
				<!--Starting of 2nd navbar content-->
				<div class="container">
					<!--<div class="row" style="background-color: white;">-->
					<form action="">
						<div class="col-sm-12">
							<center>
								<h4><b style="color:#337ab7;">Cervical Examination Summary</b></h4>
							</center>

							<center>
								<div class="panel panel-default" style="width:70%">
									<div class="panel-heading">
									</div>

									<div class="form-group" style="width:50%;">
										<label for="SCJ" style="margin-right: 360px;">SCJ</label>
										<center><select class="form-control" id="scj" name="Scj">
												<option>Partly visible</option>
											</select>
										</center>
									</div>


									<div class="form-group" style="width:50%;">
										<label for="TZ Type" style="margin-right: 334px;">TZ Type</label>
										<center><select class="form-control" id="tz_type" name="TzType">
												<option>Type1</option>
											</select>
										</center>
									</div>

									<div class="form-group" style="width:50%;">
										<label for="General Assesment" style="margin-right: 255px;">General Assesment</label>
										<center><select class="form-control" id="general_assesment" name="GeneralAssesment">
												<option>Text Assesment</option>
											</select>
										</center>
									</div>

									<div class="form-group" style="width:50%;">
										<label for="suggestion" style="margin-right: 270px;">Advice/Summery</label>
										<center><textarea type="Text" rows=4 class="form-control" id="advice_summer" name="AdviceSummery"> </textarea>
										</center>
									</div>

									<div class="panel-footer">
										<button type="submit" class="btn btn-primary" name="PriviewReport" id="priview_report" >Preview Report</button>
									</div>
								</div>
							</center>
						</div>
					</form>
				</div>
			</div>
			
							</div>
						</center>
						<br>
					</form>
				</div>
			<!--Ending of 3rd navbar content-->

</body>
</html>
//nav bar for taking value in the form of section's'