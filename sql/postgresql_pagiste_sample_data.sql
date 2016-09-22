
INSERT INTO users (user_id, firstname, lastname, username, password, emailaddress) VALUES (1, 'Test', 'Gubbe', 'testgubbe','testgubbe', 'admin@localhost.se') ;
INSERT INTO users (user_id, firstname, lastname, username, password, emailaddress) VALUES (2, 'Johan', 'Karlsson', 'johan1','password', 'admin@localhost.se') ;
INSERT INTO users (user_id, firstname, lastname, username, password, emailaddress) VALUES (3, 'Anders', 'Nilsson', 'Andsw1','password', 'admin@localhost.se') ;
INSERT INTO users (user_id, firstname, lastname, username, password, emailaddress) VALUES (4, 'Lisa', 'Bengtsson', 'lisa98','password', 'admin@localhost.se') ;
INSERT INTO users (user_id, firstname, lastname, username, password, emailaddress) VALUES (5, 'Kalle', 'Andersson', 'Kaans','password', 'admin@localhost.se') ;
INSERT INTO users (user_id, firstname, lastname, username, password, emailaddress) VALUES (6, 'Mark', 'Twain', 'MTwain','password', 'admin@localhost.se') ;
INSERT INTO users (user_id, firstname, lastname, username, password, emailaddress) VALUES (7, 'Hillevi', 'Närkesjö', 'Hilv1g3','password', 'admin@localhost.se') ;
INSERT INTO users (user_id, firstname, lastname, username, password, emailaddress) VALUES (8, 'Åsa', 'Brakvik', 'Avik34','password', 'admin@localhost.se') ;
INSERT INTO users (user_id, firstname, lastname, username, password, emailaddress) VALUES (9, 'Daniel', 'Parkinson', 'DApi4','password', 'admin@localhost.se') ;




INSERT INTO user_group (user_group_id, user_id, group_name) VALUES (1,1,'admin') ;
INSERT INTO user_group (user_group_id, user_id, group_name) VALUES (2,2,'teacher') ;
INSERT INTO user_group (user_group_id, user_id, group_name) VALUES (3,3,'student') ;
INSERT INTO user_group (user_group_id, user_id, group_name) VALUES (4,4,'student') ;
INSERT INTO user_group (user_group_id, user_id, group_name) VALUES (5,5,'student') ;
INSERT INTO user_group (user_group_id, user_id, group_name) VALUES (6,6,'teacher') ;
INSERT INTO user_group (user_group_id, user_id, group_name) VALUES (7,7,'teacher') ;
INSERT INTO user_group (user_group_id, user_id, group_name) VALUES (8,8,'teacher') ;
INSERT INTO user_group (user_group_id, user_id, group_name) VALUES (9,9,'student') ;




INSERT INTO course (course_id, coursename, user_id) VALUES (1, 'Biology A', 2) ;
INSERT INTO course (course_id, coursename, user_id) VALUES (2, 'Biology B', 2) ;
INSERT INTO course (course_id, coursename, user_id) VALUES (3, 'Biology C', 2) ;
INSERT INTO course (course_id, coursename, user_id) VALUES (4, 'Mathematics A', 7) ;
INSERT INTO course (course_id, coursename, user_id) VALUES (5, 'Mathematics B', 7) ;
INSERT INTO course (course_id, coursename, user_id) VALUES (6, 'Chemistry A', 8) ;
INSERT INTO course (course_id, coursename, user_id) VALUES (7, 'Chemistry B', 8) ;
INSERT INTO course (course_id, coursename, user_id) VALUES (8, 'History A', 6) ;
INSERT INTO course (course_id, coursename, user_id) VALUES (9, 'History B', 6) ;


INSERT INTO course_time (course_time_id, course_id,user_id, course_date) VALUES (1, 1, 2, '2016-04-04 09:00:00') ;
INSERT INTO course_time (course_time_id, course_id,user_id, course_date) VALUES (2, 1, 2, '2016-04-05 09:00:00') ;
INSERT INTO course_time (course_time_id, course_id,user_id, course_date) VALUES (3, 1, 2, '2016-04-06 09:00:00') ;
INSERT INTO course_time (course_time_id, course_id,user_id, course_date) VALUES (4, 1, 2, '2016-04-07 09:00:00') ;
INSERT INTO course_time (course_time_id, course_id,user_id, course_date) VALUES (5, 1, 2, '2016-04-08 09:00:00') ;
INSERT INTO course_time (course_time_id, course_id,user_id, course_date) VALUES (6, 4, 7, '2016-04-04 10:30:00') ;
INSERT INTO course_time (course_time_id, course_id,user_id, course_date) VALUES (7, 4, 7, '2016-04-05 10:30:00') ;
INSERT INTO course_time (course_time_id, course_id,user_id, course_date) VALUES (8, 4, 7, '2016-04-06 10:30:00') ;
INSERT INTO course_time (course_time_id, course_id,user_id, course_date) VALUES (9, 4, 7, '2016-04-07 10:30:00') ;
INSERT INTO course_time (course_time_id, course_id,user_id, course_date) VALUES (10, 4, 7, '2016-04-08 10:30:00') ;


INSERT INTO student_course (student_course_id, course_id, user_id, status, registered_date) VALUES (1, 1, 4, true, '2016-03-30 10:50:32') ;
INSERT INTO student_course (student_course_id, course_id, user_id, status, registered_date) VALUES (2, 1, 3, true, '2016-03-30 11:50:32') ;
INSERT INTO student_course (student_course_id, course_id, user_id, status, registered_date) VALUES (3, 1, 9, true, '2016-03-30 13:50:32') ;
INSERT INTO student_course (student_course_id, course_id, user_id, status, registered_date) VALUES (4, 1, 5, true, '2016-03-30 14:50:32') ;
INSERT INTO student_course (student_course_id, course_id, user_id, status, registered_date) VALUES (5, 4, 4, true, '2016-03-30 15:50:32') ;
INSERT INTO student_course (student_course_id, course_id, user_id, status, registered_date) VALUES (6, 4, 3, true, '2016-03-30 16:50:32') ;
INSERT INTO student_course (student_course_id, course_id, user_id, status, registered_date) VALUES (7, 4, 5, true, '2016-03-30 17:50:32') ;
INSERT INTO student_course (student_course_id, course_id, user_id, status, registered_date) VALUES (8, 4, 9, true, '2016-03-30 19:50:32') ;


INSERT INTO attended (attended_id, course_id, course_time_id, user_id, last_updated) VALUES (1,1,1, 5, '2016-04-04 09:59:32') ;
INSERT INTO attended (attended_id, course_id, course_time_id, user_id, last_updated) VALUES (2,1,1, 4, '2016-04-04 09:59:32') ;
INSERT INTO attended (attended_id, course_id, course_time_id, user_id, last_updated) VALUES (3,1,1, 3, '2016-04-04 09:59:32') ;
INSERT INTO attended (attended_id, course_id, course_time_id, user_id, last_updated) VALUES (4,1,1, 9, '2016-04-04 09:59:32') ;

INSERT INTO attended (attended_id, course_id, course_time_id, user_id, last_updated) VALUES (5,4,6, 5, '2016-04-04 12:00:32') ;
INSERT INTO attended (attended_id, course_id, course_time_id, user_id, last_updated) VALUES (6,4,6, 4, '2016-04-04 12:00:32') ;
INSERT INTO attended (attended_id, course_id, course_time_id, user_id, last_updated) VALUES (7,4,6, 3, '2016-04-04 12:00:32') ;
INSERT INTO attended (attended_id, course_id, course_time_id, user_id, last_updated) VALUES (8,4,6, 9, '2016-04-04 12:00:32') ;

INSERT INTO attended (attended_id, course_id, course_time_id, user_id, last_updated) VALUES (9,1,2, 9, '2016-04-05 09:59:32') ;
INSERT INTO attended (attended_id, course_id, course_time_id, user_id, last_updated) VALUES (10,1,2, 4, '2016-04-05 09:59:32') ;
INSERT INTO attended (attended_id, course_id, course_time_id, user_id, last_updated) VALUES (11,1,2, 5, '2016-04-05 09:59:32') ;

INSERT INTO attended (attended_id, course_id, course_time_id, user_id, last_updated) VALUES (12,4,7, 9, '2016-04-05 12:00:32') ;
INSERT INTO attended (attended_id, course_id, course_time_id, user_id, last_updated) VALUES (13,4,7, 4, '2016-04-05 12:00:32') ;
INSERT INTO attended (attended_id, course_id, course_time_id, user_id, last_updated) VALUES (14,4,7, 5, '2016-04-05 12:00:32') ;