
$(document).ready(function() {
			var allUsers = [];
			var allLoans = [];

			//code for behavior after clicking login button 
			$('#submit').one('click',function() {
				var loginJsonData = JSON.stringify($(document.loginForm).serializeObject());
				console.log("After submit click "+loginJsonData);

				var userIDFromForm = $('#username').val();
				var pwdFromForm = $('#password').val();
				
				$.ajax({
					type: 'POST',
					url: '/Los1/login',
					data:loginJsonData,
					contentType: "application/json",
				    dataType: 'json',
					 }).done(function(data) {console.log(data);
							window.location.href = "loans.html";
						}).fail(function(status){console.log("got error"); });
				});
				
			
			//code for behavior after clicking login button 
			$('#borrowerSubmit').click(function(){
				var borrowerJsonData = JSON.stringify($(document.borrowerForm).serializeObject());
				console.log(borrowerJsonData);
				$.ajax({
					type: 'POST',
					url: '/Los1/saveBorrowers',
					data:borrowerJsonData,
					    contentType: "application/json",
					    dataType: 'json'
				}).done(function(data) {
					console.log(data);
					window.location.href = "login.html";
					}).fail(function(status){ console.log("got error"); });
					
				});
				
				
			//When loans document loads it would get json and display them
		$(document).ready(function(){
			$.getJSON('/Los1/loans', function(Data) {
				allLoans = Data;
				$.each(allLoans, function(index, loan) {

					$("#Table").append(
							"<tr>" + "<td>" + "<a id='" + index + "'href ='#'>"
									+ (loan.loanId) + "</a>" + "</td>"
									+ "<td>" + (loan.brwrFname) + "</td>"
									+ "<td>" + (loan.brwrLname) + "</td>"
									+"<td>"+ (loan.processorName) + "</td>"+
									"<td>"+ (loan.status) + "</td>" + "</tr>");

				});
			})});

			$(document).one('click','#signUpButton',function(){
				
				var jsonData = JSON.stringify($(document.myform).serializeObject());
				console.log(jsonData);
				
				$.ajax({
					type: 'POST',
					url: '/Los1/signup',
					data:jsonData,
				    contentType: "application/json",
				    dataType: 'json'
					
										
				}).done(function(data) {
					console.log(data);
					window.location.href = "login.html";
				}).fail(function(status)
						{
					console.log("got error");

						});
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
												+ '<p> Status = '
												+ loanRecord.status + '</p>');
								loanNumexits = true;
								
							
								return false;
							}
						});
					}));
			
			
		});

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
function ReloadPage() {
	   location.reload();
	};

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
