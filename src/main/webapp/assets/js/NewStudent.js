let student_form = document.getElementById('student-validation');

student_form.addEventListener('submit', async (e) => {
    e.preventDefault();
    e.stopPropagation();
    if (student_form.checkValidity() === true) {
        let response = await fetch('http://localhost:8080/ERP_war_exploded/api/Student/putStu', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json;charset=utf-8'
            },
            body: JSON.stringify({
                roll_no: document.getElementById('roll_no').value,
                first_name: document.getElementById('first_name').value,
                last_name: document.getElementById('last_name').value,
                email: document.getElementById('email').value,
                pic_path: document.getElementById('pic_path').value,
                cgpa: document.getElementById('cgpa').value,
                total_credit: document.getElementById('total_credit').value,
                grad_year: document.getElementById('grad_year').value,
            })
        });
        let result = await response;
        console.log(result);
    }
    student_form.classList.add('was-validated');
});
