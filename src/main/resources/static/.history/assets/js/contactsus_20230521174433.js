$(document).ready(function() {
    $('#signUpForm').submit(function(event) {
        event.preventDefault();

        var name = $('#name').val();
        var email = $('#email').val();
        var password = $('#password').val();
        var address = $('#address').val();
        var phone =  $('#Phone').val();
        var message  =  $('#message').val();
        var notes = $('#subject').val()
        console.log("inside ajax");

        var user = {
            name: name,
            email: email,
            password: password,
            phone :phone,
            address : address,
            message : message,
            notes : subject


        };

        $.ajax({
            method: 'post',
            url: 'localhost:8092/user/addUser/',
            contentType: 'application/json',
            data: JSON.stringify(user),
            success: function() {
                alert('Signup successful!');
                // Optionally redirect to a new page or perform other actions
            },
            error: function() {
                alert('Error occurred during signup!');
            }
        });
    });
});
