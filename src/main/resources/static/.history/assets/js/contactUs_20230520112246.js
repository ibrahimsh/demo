$(document).ready(function() {
    $('#contact').submit(function(event) {
        event.preventDefault();

        var name = $('#name').val();
        var email = $('#email').val();
        var password = $('#password').val();
        var address = $('#address').val();
        var phone =  $('#Phone').val();
        var message  =  $('#message').val();


        var user = {
            username: username,
            email: email,
            password: password
        };

        $.ajax({
            type: 'POST',
            url: '/signup',
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
