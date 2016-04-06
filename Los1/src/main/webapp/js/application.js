
$(document).ready(
		function() {
			var allUsers = [];
			var allLoans = [];


			$('#submit').one('click',function() {
				var loginJsonData = JSON.stringify($(document.loginForm).serializeObject());
				console.log("After submit click "+loginJsonData);

				var userIDFromForm = $('#username').val();
				var pwdFromForm = $('#password').val();
				
				$.ajax({
					type: 'POST',
					url: 'http://localhost:8089/Los1/login',
					data:loginJsonData,
					 contentType: "application/json",
					    dataType: 'json',
					//
					 success: function() {
						 console.log("Was in login Success Block");
						 window.location.href = "loans.html";
					 }
					 
					   
					    	
					
				});
				
				return false;
//				if (exists(allUsers, userIDFromForm, pwdFromForm)) {
					
//				}

//				else {
//					alert('Invalid username or password');
//				}
			});
			
			$('#borrowerSubmit').click(function(){
				var borrowerJsonData = JSON.stringify($(document.borrowerForm).serializeObject());
				console.log(borrowerJsonData);
				$.ajax({
					type: 'POST',
					url: 'http://localhost:8089/Los1/saveBorrowers',
					data:borrowerJsonData,
					 success: function() {
						 console.log("Was in borrowerSubmit Success Block");
					 },
					    contentType: "application/json",
					    dataType: 'json'
					
				});
				return false;
				
				
			});

			$.getJSON('http://localhost:8089/Los1/loans', function(Data) {
				allLoans = Data;
				$.each(allLoans, function(index, loan) {

					$("#Table").append(
							"<tr>" + "<td>" + "<a id='" + index + "'href ='#'>"
									+ (loan.loanId) + "</a>" + "</td>"
									+ "<td>" + (loan.brwrFname) + "</td>"
									+ "<td>" + (loan.brwrLname) + "</td>"
									+ "<td>" + (loan.brkrFname) + "</td>"
									+ "<td>" + (loan.brkrLname) + "</td>" +
									"<td>"+ (loan.processorName) + "</td>"+
									"<td>"+ (loan.status) + "</td>" + "</tr>");

				});
			});

			$(document).one('click','#signUpButton',function(){
				
				var jsonData = JSON.stringify($(document.myform).serializeObject());
				console.log(jsonData);
				
				$.ajax({
					type: 'POST',
					url: 'http://localhost:8089/Los1/signup',
					data:jsonData,
				    contentType: "application/json",
				    dataType: 'json',
					sucess: function ()
					{
						console.log("In the success block of signUpButton Function");
						window.location.href = "login.html";

					}
					
					
				});
								return true;
				
				
				
			});
			$(document).one(
					'click',
					'#0',
					(function() {

						$.each(allLoans, function(index, loanRecord) {
							var loanNumexits = false;
							var loannum = $('#0').text();
							console.log('Id =' + loannum);
							if (loannum == loanRecord.loanId)
							{
								
								$('#details').append(
										'<p><b>Details about loan</b> </p>'
												+ '<p>Borrower First Name = '
												+ loanRecord.brwrFname
												+ '</p>'
												+ '<p>Borrower First Name = '
												+ loanRecord.brwrLname + '</p>'
												+ '<p>Processor Name = '
												+ loanRecord.processorName
												+ '</p>' + '<p> Borrower First Name = '
												+ loanRecord.brkrFname + '</p>'
												+'</p>' + '<p> Borrower Last Name = '
												+ loanRecord.brkrLname + '</p>'+ '<p> Status = '
												+ loanRecord.status + '</p>');
								loanNumexits = true;
								
							
								return false;
							}
						});
					}));
			
			

		}); // document.ready ends

//function exists(allUsers, username, password) {
//	var userExists = false;
//	$.each(allUsers, function(index, broker) {
//		if (username == broker.bUserName && password == broker.bPassword) {
//
//			userExists = true;
//			return false;
//		}
//	});
//
//	return userExists;
//};

$.fn.serializeObject = function()
{
    var o = {};
    var a = this.serializeArray();
    $.each(a, function() {
        if (o[this.name] !== undefined) {
            if (!o[this.name].push) {
                o[this.name] = [o[this.name]];
            }
            o[this.name].push(this.value || '');
        } else {
            o[this.name] = this.value || '';
        }
    });
    return o;
};
