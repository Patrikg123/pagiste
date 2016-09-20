
INSERT INTO users (user_id, firstname, lastname, username, password, emailaddress) VALUES (1, 'Test', 'Gubbe', 'testgubbe','testgubbe', 'admin@localhost.se') ;
INSERT INTO users (user_id, firstname, lastname, username, password, emailaddress) VALUES (2, 'Johan', 'Karlsson', 'johan1','password', 'admin@localhost.se') ;
INSERT INTO users (user_id, firstname, lastname, username, password, emailaddress) VALUES (3, 'Anders', 'Nilsson', 'Andsw1','password', 'admin@localhost.se') ;
INSERT INTO users (user_id, firstname, lastname, username, password, emailaddress) VALUES (4, 'Lisa', 'Bengtsson', 'lisa98','password', 'admin@localhost.se') ;
INSERT INTO users (user_id, firstname, lastname, username, password, emailaddress) VALUES (5, 'Kalle', 'Andersson', 'Kaans','password', 'admin@localhost.se') ;



INSERT INTO user_group (group_id, user_id, group_name) VALUES (1,1,'admin') ;
INSERT INTO user_group (group_id, user_id, group_name) VALUES (2,2,'teacher') ;
INSERT INTO user_group (group_id, user_id, group_name) VALUES (3,3,'student') ;
INSERT INTO user_group (group_id, user_id, group_name) VALUES (4,4,'student') ;
INSERT INTO user_group (group_id, user_id, group_name) VALUES (5,5,'student') ;

INSERT INTO course (course_id, coursename, user_id) VALUES (1, 'Biology', 2) ;

INSERT INTO course_time (course_time_id, course_id,user_id, course_date) VALUES (1, 1, 2, '2016-04-05 20:50:32') ;

INSERT INTO student_course (student_course_id, course_id, user_id, status, registered_date) VALUES (1, 1, 4, true, '2016-04-05 20:50:32') ;
INSERT INTO student_course (student_course_id, course_id, user_id, status, registered_date) VALUES (2, 1, 5, true, '2016-04-05 10:50:32') ;


INSERT INTO attended (attended_id, course_id, course_time_id, user_id, last_updated) VALUES (1,1,1, 5, '2016-09-12 09:50:32') ;

