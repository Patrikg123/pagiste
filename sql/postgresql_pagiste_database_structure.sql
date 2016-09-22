DROP SEQUENCE seq_users CASCADE;
DROP TABLE users;

CREATE SEQUENCE seq_users;
CREATE TABLE users (
	user_id INT4 NOT NULL DEFAULT nextval('seq_users'),
	firstname VARCHAR (64) NOT NULl,
	lastname VARCHAR (64) NOT NULL,
	username VARCHAR(64) NOT NULL,
	password VARCHAR(255) NOT NULL,
	emailaddress VARCHAR(64) NOT NULL,
	last_login TIMESTAMP
	,PRIMARY KEY (user_id));

DROP SEQUENCE seq_user_group CASCADE;
DROP TABLE user_group;

CREATE SEQUENCE seq_user_group;
CREATE TABLE user_group (
	user_group_id INT4 NOT NULL DEFAULT nextval('seq_user_group'),
	user_id INT4 NOT NULL,
	group_name VARCHAR(128) NOT NULL
	,PRIMARY KEY (user_group_id));

DROP SEQUENCE seq_course CASCADE;
DROP TABLE course;

CREATE SEQUENCE seq_course;
CREATE TABLE course (
	course_id INT4 NOT NULL DEFAULT nextval('seq_course'),
	coursename VARCHAR(128) NOT NULL,
	user_id INT4 NOT NULL
	,PRIMARY KEY (course_id));


DROP SEQUENCE seq_course_time CASCADE;
DROP TABLE course_time;

CREATE SEQUENCE seq_course_time;
CREATE TABLE course_time (
	course_time_id INT4 NOT NULL DEFAULT nextval('seq_course_time'),
	course_id INT4 NOT NULL,
	user_id INT4 NOT NULL,
	course_date TIMESTAMP
	,PRIMARY KEY (course_time_id));

DROP SEQUENCE seq_student_course CASCADE;
DROP TABLE student_course;

CREATE SEQUENCE seq_student_course;
CREATE TABLE student_course (
	student_course_id INT4 NOT NULL DEFAULT nextval('seq_student_course'),
	course_id INT4 NOT NULL,
	user_id INT4 NOT NULL,
	status BOOLEAN NOT NULL,
	registered_date TIMESTAMP,
	unregistered_date TIMESTAMP
	,PRIMARY KEY (student_course_id));


DROP SEQUENCE seq_attended CASCADE;
DROP TABLE attended;

CREATE SEQUENCE seq_attended;
CREATE TABLE attended (
	attended_id INT4 NOT NULL DEFAULT nextval('seq_attended'),
	course_id INT4 NOT NULL,
	course_time_id INT4 NOT NULL,
	user_id INT4 NOT NULL,
	last_updated TIMESTAMP
	,PRIMARY KEY (attended_id));