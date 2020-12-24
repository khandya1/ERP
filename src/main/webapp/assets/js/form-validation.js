//let student_form = document.getElementById('student-validation');
let course_form = document.getElementById('course-validation');
window.onload = fetch_courses;

course_form.addEventListener('submit', async (e) => {
    e.preventDefault();
    e.stopPropagation();
    if (course_form.checkValidity() === true) {
        let response = await fetch('http://localhost:8080/ERP_war_exploded/api/courses/register', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json;charset=utf-8'
            },
            body: JSON.stringify({
                course_code: document.getElementById('Course_Code').value,
                name: document.getElementById('Name').value,
                description: document.getElementById('Description').value,
                year: document.getElementById('Year').value,
                term: document.getElementById('Term').value,
                credits: document.getElementById('credits').value,
                capacity: document.getElementById('capacity').value,
                faculty: document.getElementById('faculty').value,
            })
        });
        let result = await response;
        console.log(result);
    }
    course_form.classList.add('was-validated');
});

async function fetch_courses(){
    let response = await fetch("http://localhost:8080/ERP_war_exploded/api/courses/get");
    let Term = await response.json(); // read response body and parse as JSON
    console.log(Term);
    let courses_option = document.getElementById('Term');
    courses_option.innerHTML = '<option value=""> Choose...</option>';

    for(let i = 0 ; i<Term.length ; i++){
        courses_option.innerHTML += '<option value="'+Term[i]+'">'+Term[i]+'</option>';
    }
}