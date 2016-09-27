--
-- PostgreSQL database dump
--

-- Dumped from database version 9.5.3
-- Dumped by pg_dump version 9.5.3

SET statement_timeout = 0;
SET lock_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SET check_function_bodies = false;
SET client_min_messages = warning;
SET row_security = off;

--
-- Name: pagiste; Type: DATABASE; Schema: -; Owner: postgres
--

CREATE DATABASE pagiste WITH TEMPLATE = template0 ENCODING = 'UTF8' LC_COLLATE = 'Swedish_Sweden.1252' LC_CTYPE = 'Swedish_Sweden.1252';


ALTER DATABASE pagiste OWNER TO postgres;

\connect pagiste

SET statement_timeout = 0;
SET lock_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SET check_function_bodies = false;
SET client_min_messages = warning;
SET row_security = off;

--
-- Name: plpgsql; Type: EXTENSION; Schema: -; Owner: 
--

CREATE EXTENSION IF NOT EXISTS plpgsql WITH SCHEMA pg_catalog;


--
-- Name: EXTENSION plpgsql; Type: COMMENT; Schema: -; Owner: 
--

COMMENT ON EXTENSION plpgsql IS 'PL/pgSQL procedural language';


SET search_path = public, pg_catalog;

--
-- Name: seq_attended; Type: SEQUENCE; Schema: public; Owner: admin
--

CREATE SEQUENCE seq_attended
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE seq_attended OWNER TO admin;

SET default_tablespace = '';

SET default_with_oids = false;

--
-- Name: attended; Type: TABLE; Schema: public; Owner: admin
--

CREATE TABLE attended (
    attended_id integer DEFAULT nextval('seq_attended'::regclass) NOT NULL,
    course_id integer NOT NULL,
    course_time_id integer NOT NULL,
    user_id integer NOT NULL,
    last_updated timestamp without time zone
);


ALTER TABLE attended OWNER TO admin;

--
-- Name: seq_course; Type: SEQUENCE; Schema: public; Owner: admin
--

CREATE SEQUENCE seq_course
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE seq_course OWNER TO admin;

--
-- Name: course; Type: TABLE; Schema: public; Owner: admin
--

CREATE TABLE course (
    course_id integer DEFAULT nextval('seq_course'::regclass) NOT NULL,
    coursename character varying(128) NOT NULL,
    user_id integer NOT NULL
);


ALTER TABLE course OWNER TO admin;

--
-- Name: seq_course_time; Type: SEQUENCE; Schema: public; Owner: admin
--

CREATE SEQUENCE seq_course_time
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE seq_course_time OWNER TO admin;

--
-- Name: course_time; Type: TABLE; Schema: public; Owner: admin
--

CREATE TABLE course_time (
    course_time_id integer DEFAULT nextval('seq_course_time'::regclass) NOT NULL,
    course_id integer NOT NULL,
    user_id integer NOT NULL,
    course_date timestamp without time zone
);


ALTER TABLE course_time OWNER TO admin;

--
-- Name: seq; Type: SEQUENCE; Schema: public; Owner: admin
--

CREATE SEQUENCE seq
    START WITH 50
    INCREMENT BY 50
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE seq OWNER TO admin;

--
-- Name: seq_student_course; Type: SEQUENCE; Schema: public; Owner: admin
--

CREATE SEQUENCE seq_student_course
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE seq_student_course OWNER TO admin;

--
-- Name: seq_user_group; Type: SEQUENCE; Schema: public; Owner: admin
--

CREATE SEQUENCE seq_user_group
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE seq_user_group OWNER TO admin;

--
-- Name: seq_users; Type: SEQUENCE; Schema: public; Owner: admin
--

CREATE SEQUENCE seq_users
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE seq_users OWNER TO admin;

--
-- Name: seq_users_group; Type: SEQUENCE; Schema: public; Owner: admin
--

CREATE SEQUENCE seq_users_group
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE seq_users_group OWNER TO admin;

--
-- Name: sequence; Type: TABLE; Schema: public; Owner: admin
--

CREATE TABLE sequence (
    seq_name character varying(50) NOT NULL,
    seq_count numeric(38,0)
);


ALTER TABLE sequence OWNER TO admin;

--
-- Name: student; Type: TABLE; Schema: public; Owner: admin
--

CREATE TABLE student (
    student_id integer NOT NULL,
    course_id integer,
    user_id integer
);


ALTER TABLE student OWNER TO admin;

--
-- Name: student_course; Type: TABLE; Schema: public; Owner: admin
--

CREATE TABLE student_course (
    student_course_id integer DEFAULT nextval('seq_student_course'::regclass) NOT NULL,
    course_id integer NOT NULL,
    status boolean NOT NULL,
    registered_date timestamp without time zone,
    unregistered_date timestamp without time zone,
    student_id integer NOT NULL
);


ALTER TABLE student_course OWNER TO admin;

--
-- Name: student_student_id_seq; Type: SEQUENCE; Schema: public; Owner: admin
--

CREATE SEQUENCE student_student_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE student_student_id_seq OWNER TO admin;

--
-- Name: student_student_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: admin
--

ALTER SEQUENCE student_student_id_seq OWNED BY student.student_id;


--
-- Name: teacher; Type: TABLE; Schema: public; Owner: admin
--

CREATE TABLE teacher (
    teacher_id integer NOT NULL,
    user_id integer
);


ALTER TABLE teacher OWNER TO admin;

--
-- Name: teacher_teacer_id_seq; Type: SEQUENCE; Schema: public; Owner: admin
--

CREATE SEQUENCE teacher_teacer_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE teacher_teacer_id_seq OWNER TO admin;

--
-- Name: teacher_teacer_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: admin
--

ALTER SEQUENCE teacher_teacer_id_seq OWNED BY teacher.teacher_id;


--
-- Name: user_group; Type: TABLE; Schema: public; Owner: admin
--

CREATE TABLE user_group (
    group_id integer DEFAULT nextval('seq_user_group'::regclass) NOT NULL,
    user_id integer NOT NULL,
    group_name character varying(128) NOT NULL
);


ALTER TABLE user_group OWNER TO admin;

--
-- Name: users2; Type: TABLE; Schema: public; Owner: admin
--

CREATE TABLE users2 (
    username character varying(64) NOT NULL,
    password character varying(255) NOT NULL,
    emailaddress character varying(64) NOT NULL,
    last_login timestamp without time zone,
    firstname character varying(64),
    lastname character varying(64) NOT NULL,
    user_id integer NOT NULL
);


ALTER TABLE users2 OWNER TO admin;

--
-- Name: users_user_id_seq; Type: SEQUENCE; Schema: public; Owner: admin
--

CREATE SEQUENCE users_user_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE users_user_id_seq OWNER TO admin;

--
-- Name: users_user_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: admin
--

ALTER SEQUENCE users_user_id_seq OWNED BY users2.user_id;


--
-- Name: student_id; Type: DEFAULT; Schema: public; Owner: admin
--

ALTER TABLE ONLY student ALTER COLUMN student_id SET DEFAULT nextval('student_student_id_seq'::regclass);


--
-- Name: teacher_id; Type: DEFAULT; Schema: public; Owner: admin
--

ALTER TABLE ONLY teacher ALTER COLUMN teacher_id SET DEFAULT nextval('teacher_teacer_id_seq'::regclass);


--
-- Name: user_id; Type: DEFAULT; Schema: public; Owner: admin
--

ALTER TABLE ONLY users2 ALTER COLUMN user_id SET DEFAULT nextval('users_user_id_seq'::regclass);


--
-- Data for Name: attended; Type: TABLE DATA; Schema: public; Owner: admin
--

COPY attended (attended_id, course_id, course_time_id, user_id, last_updated) FROM stdin;
1	1	1	5	2016-09-12 09:50:32
\.


--
-- Data for Name: course; Type: TABLE DATA; Schema: public; Owner: admin
--

COPY course (course_id, coursename, user_id) FROM stdin;
1	Biology	2
0	Philosophy	2
101	Computerscience	2
201	History	2
351	Chemistry	2
501	Japanese	2
502	Chinese	2
1701	German	2
1801	French	2
1901	Spanish	2
2551	Japanese	2
2851	Japanese	2
2852	Swahili	2
2853	Portugese	2
2951	Japanese	2
2952	Japanese	2
2953	Japanese	2
3051	Japanese	1
3151	Japanese	2
3152	Japanese	1
3251	Geography	1
3451	Estonian	2
4901	Religion	2
10501	Artificial Intelligence	2
13701	Art History	10652
\.


--
-- Data for Name: course_time; Type: TABLE DATA; Schema: public; Owner: admin
--

COPY course_time (course_time_id, course_id, user_id, course_date) FROM stdin;
1	1	2	2016-04-05 20:50:32
\.


--
-- Name: seq; Type: SEQUENCE SET; Schema: public; Owner: admin
--

SELECT pg_catalog.setval('seq', 13750, true);


--
-- Name: seq_attended; Type: SEQUENCE SET; Schema: public; Owner: admin
--

SELECT pg_catalog.setval('seq_attended', 22, true);


--
-- Name: seq_course; Type: SEQUENCE SET; Schema: public; Owner: admin
--

SELECT pg_catalog.setval('seq_course', 22, true);


--
-- Name: seq_course_time; Type: SEQUENCE SET; Schema: public; Owner: admin
--

SELECT pg_catalog.setval('seq_course_time', 22, true);


--
-- Name: seq_student_course; Type: SEQUENCE SET; Schema: public; Owner: admin
--

SELECT pg_catalog.setval('seq_student_course', 23, true);


--
-- Name: seq_user_group; Type: SEQUENCE SET; Schema: public; Owner: admin
--

SELECT pg_catalog.setval('seq_user_group', 1, false);


--
-- Name: seq_users; Type: SEQUENCE SET; Schema: public; Owner: admin
--

SELECT pg_catalog.setval('seq_users', 29, true);


--
-- Name: seq_users_group; Type: SEQUENCE SET; Schema: public; Owner: admin
--

SELECT pg_catalog.setval('seq_users_group', 21, true);


--
-- Data for Name: sequence; Type: TABLE DATA; Schema: public; Owner: admin
--

COPY sequence (seq_name, seq_count) FROM stdin;
SEQ_GEN	0
\.


--
-- Data for Name: student; Type: TABLE DATA; Schema: public; Owner: admin
--

COPY student (student_id, course_id, user_id) FROM stdin;
1	1	1
7653	\N	7651
7652	\N	3
7953	\N	7951
7952	\N	4
7956	\N	7954
8052	\N	8051
8054	\N	8053
2	1	5
3	101	5151
4	201	5401
5802	\N	5402
5901	\N	5403
7955	\N	5601
8702	\N	8701
\.


--
-- Data for Name: student_course; Type: TABLE DATA; Schema: public; Owner: admin
--

COPY student_course (student_course_id, course_id, status, registered_date, unregistered_date, student_id) FROM stdin;
1	1	t	2016-04-05 20:50:32	\N	2
2	1	t	2016-04-05 10:50:32	\N	3
3	0	t	\N	\N	3
\.


--
-- Name: student_student_id_seq; Type: SEQUENCE SET; Schema: public; Owner: admin
--

SELECT pg_catalog.setval('student_student_id_seq', 4, true);


--
-- Data for Name: teacher; Type: TABLE DATA; Schema: public; Owner: admin
--

COPY teacher (teacher_id, user_id) FROM stdin;
1	2
2	6
10652	10651
13703	13702
\.


--
-- Name: teacher_teacer_id_seq; Type: SEQUENCE SET; Schema: public; Owner: admin
--

SELECT pg_catalog.setval('teacher_teacer_id_seq', 1, false);


--
-- Data for Name: user_group; Type: TABLE DATA; Schema: public; Owner: admin
--

COPY user_group (group_id, user_id, group_name) FROM stdin;
1	1	admin
2	2	teacher
3	3	student
4	4	student
5	5	student
\.


--
-- Data for Name: users2; Type: TABLE DATA; Schema: public; Owner: admin
--

COPY users2 (username, password, emailaddress, last_login, firstname, lastname, user_id) FROM stdin;
testgubbe	testgubbe	admin@localhost.se	\N	Test	Gubbe	1
teacher1	password	admin@localhost.se	\N	Teacher	Taughtkinson	2
studen1	password	admin@localhost.se	\N	Sture	Student	3
Lisa Bengtsson	password	admin@localhost.se	\N	Lisa	Bengtsson	4
Kalle Andersson	password	admin@localhost.se	\N	Kalle	Andersson	5
Bengan	password	bengt@localhost.se	\N	Bengt	Svensson	6
?	?	?	\N	?	?	7
pg	ph	pg@pg.com	\N	pg	pg	5151
Sharon	pg	sharon@localhost.com	\N	pg	stone	5401
Sharon123	password	sharon@localhost.com	\N	pg	stonesson	5402
Sharon1234	password	sharon@localhost.com	\N	pgsson	stonesson	5403
pengo	password	pacman@localhost.com	\N	pac	man	5501
Musse	password	mickeymouse@localhost.com	\N	Musse	Pigg	5601
Sharon	s	sharon@localhost.com	\N	s	s	5701
Gandalf	password	gg@localhost.com	\N	Gandalf	Grey	5801
frodo	password	frodo@localhost.com	\N	frodo	baggins	5901
sam	password	sam@localhost.com	\N	sam	baggins	6001
sammy	password	sammy@localhost.com	\N	sammy	davis	6101
jerry	password	jerry@localhost.com	\N	jerry	seinfeld	6201
gggg	password	gggg@localhost.com	\N	good	game	6301
elaine	password	elaine@localhost.com	\N	elaine	benes	6401
George	password	vandalayindustries@localhost.com	\N	George	Costanza	6501
kavorka	password	kavorka@localhost.com	\N	emanuel	kramer	6801
oden	password	valhalla@localhost.com	\N	oden	gudmunsson	6901
sheldon	password	sheldon@localhost.com	\N	Sheldon	ejbson	7001
olga	password	olga@localhost.com	\N	olga	olgasdotter	7101
bombadill	password	bombadill@localhost.com	\N	tom	bombadill	7651
qwerty	password	qwert@localhost.com	\N	qwerty	ytrewq	7951
qwerty123	password	qwertson@localhost.com	\N	qwertyson	ytrewqson	7954
poiuyt	password	poiuyt@localhost.com	\N	poiuyt	tyuiop	8051
poiuytson	password	poiuytson@localhost.com	\N	poiuytson	tyuiopson	8053
smurfalizer	password	smurf@localhost.com	\N	smurfname	smurflastname	8151
lunch	password	clown@localhost.com	\N	Roland	McDonaldsson	8251
ronald2	password	bigmaccu2localhost.com	\N	rolando	mcdonaldo	8351
Gandalfu	password	wizard@localhost.com	\N	gandalf	greyson	8701
Gino	password	ginao@localhost.com	\N	Gino	Morina	9401
daniel	password	danne@localhost.com	\N	Daniel	Eriksson	10651
Fingal	password	fingal@localhost.com	\N	Fingal	ohlsson	13702
\.


--
-- Name: users_user_id_seq; Type: SEQUENCE SET; Schema: public; Owner: admin
--

SELECT pg_catalog.setval('users_user_id_seq', 7, true);


--
-- Name: attended_pkey; Type: CONSTRAINT; Schema: public; Owner: admin
--

ALTER TABLE ONLY attended
    ADD CONSTRAINT attended_pkey PRIMARY KEY (course_id);


--
-- Name: course_pkey; Type: CONSTRAINT; Schema: public; Owner: admin
--

ALTER TABLE ONLY course
    ADD CONSTRAINT course_pkey PRIMARY KEY (course_id);


--
-- Name: course_time_pkey; Type: CONSTRAINT; Schema: public; Owner: admin
--

ALTER TABLE ONLY course_time
    ADD CONSTRAINT course_time_pkey PRIMARY KEY (course_id);


--
-- Name: pk_student_id; Type: CONSTRAINT; Schema: public; Owner: admin
--

ALTER TABLE ONLY student
    ADD CONSTRAINT pk_student_id PRIMARY KEY (student_id);


--
-- Name: pk_tearcher_id; Type: CONSTRAINT; Schema: public; Owner: admin
--

ALTER TABLE ONLY teacher
    ADD CONSTRAINT pk_tearcher_id PRIMARY KEY (teacher_id);


--
-- Name: pk_user_id; Type: CONSTRAINT; Schema: public; Owner: admin
--

ALTER TABLE ONLY users2
    ADD CONSTRAINT pk_user_id PRIMARY KEY (user_id);


--
-- Name: sequence_pkey; Type: CONSTRAINT; Schema: public; Owner: admin
--

ALTER TABLE ONLY sequence
    ADD CONSTRAINT sequence_pkey PRIMARY KEY (seq_name);


--
-- Name: student_course_pkey; Type: CONSTRAINT; Schema: public; Owner: admin
--

ALTER TABLE ONLY student_course
    ADD CONSTRAINT student_course_pkey PRIMARY KEY (student_course_id);


--
-- Name: user_group_pkey; Type: CONSTRAINT; Schema: public; Owner: admin
--

ALTER TABLE ONLY user_group
    ADD CONSTRAINT user_group_pkey PRIMARY KEY (user_id);


--
-- Name: fk_course_id; Type: FK CONSTRAINT; Schema: public; Owner: admin
--

ALTER TABLE ONLY student
    ADD CONSTRAINT fk_course_id FOREIGN KEY (course_id) REFERENCES course(course_id);


--
-- Name: fk_student_id; Type: FK CONSTRAINT; Schema: public; Owner: admin
--

ALTER TABLE ONLY student_course
    ADD CONSTRAINT fk_student_id FOREIGN KEY (student_id) REFERENCES student(student_id);


--
-- Name: fk_user_id; Type: FK CONSTRAINT; Schema: public; Owner: admin
--

ALTER TABLE ONLY teacher
    ADD CONSTRAINT fk_user_id FOREIGN KEY (user_id) REFERENCES users2(user_id);


--
-- Name: public; Type: ACL; Schema: -; Owner: postgres
--

REVOKE ALL ON SCHEMA public FROM PUBLIC;
REVOKE ALL ON SCHEMA public FROM postgres;
GRANT ALL ON SCHEMA public TO postgres;
GRANT ALL ON SCHEMA public TO PUBLIC;


--
-- PostgreSQL database dump complete
--

