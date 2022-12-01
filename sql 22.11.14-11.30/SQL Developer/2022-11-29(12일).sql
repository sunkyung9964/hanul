select employee_id, first_name, last_name
from employees
where salary =(select max(salary)from employees);

select employee_id, first_name, last_name
from employees
where salary <(select avg(salary)from employees);

select employee_id, first_name, last_name, salary
from employees
where salary > (select salary
                from employees
                where employee_id = 108)
order by 1;                

select e.employee_id, e.first_name, e.last_name, j.job_title
from employees e, jobs j
where e.salary = (select max(salary)from employees)
and e.job_id = j.job_id
order by 1;

select e.employee_id, e.first_name, e.last_name, j.job_title, e.salary 
from employees e, jobs j
where e.salary = (select min(salary)from employees)
and e.job_id = j.job_id
order by 1;

select employee_id, first_name, department_id, job_id, 
from employees 
where department_id = (select department_id
                        from departments
                        where department_name

order by 1;

desc departments;
