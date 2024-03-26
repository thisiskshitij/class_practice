$(document).ready(function() {
    $('#todo-form').submit(function(event) {
      event.preventDefault();
      var taskInput = $('#task-input').val();
      if (taskInput !== '') {
        $('#task-list').append('<li>' + taskInput + '</li>');
        $('#task-input').val('');
      }
    });
  
    $(document).on('click', 'li', function() {
      $(this).toggleClass('completed');
    });
  
    $('#clear-completed').click(function() {
      $('li.completed').remove();
    });
  });
  