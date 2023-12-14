
drop database university;
create database university;

use university;

create table student (
snum integer primary key,
sname varchar(32),
major varchar(32),
level varchar(32),
age integer);

insert into student values (1, "Laith Al-Saud", "History", "FR", 18);
insert into student values (2, "Sean William Anthony", "Computer Science", "FR", 18);
insert into student values (3, "Lyall Armstrong", "Islamic Thought", "FR", 19);
insert into student values (4, "Natasha Dean Ayers", "Electrical Engineering", "FR", 20);
insert into student values (5, "William Gary Babcock", "Business Administration", "FR", 25);


insert into student values (6, "Kathryn Elaine Bandy", "Physics", "SO", 19);
insert into student values (7, "Harry Bastermajian", "Computer Systems Engineering", "SO", 19);
insert into student values (8, "Esra Birinci", "English", "SO", 28);
insert into student values (9, "Catherine Lynn Bronson", "Civil Engineering", "SO", 20);
insert into student values (10, "James Michael Burgin", "Business Administration", "SO", 25);

insert into student values (11, "Laura Naomi Cappe", "Chemistry", "JR", 20);
insert into student values (12, "Ted J Cohen", "Arabic Language", "JR", 20);
insert into student values (13, "Elena Dodge Corbett", "English", "JR", 20);
insert into student values (14, "Colleen Anne Coyle", "Civil Engineering", "JR", 22);
insert into student values (15, "Joseph Lamar Daniels", "Business Administration", "JR", 19);


insert into student values (16, "Ala Jabar Mohammed", "Chemistry", "SR", 21);
insert into student values (17, "Joanne Hein", "Physics", "SR", 21);
insert into student values (18, "Marcia Keegan", "English", "SR",  22);
insert into student values (19, "Nina Terrey", "Civil Engineering", "SR", 22);
insert into student values (20, "Sandra Lyons", "History", "SR", 29);

insert into student values (21, "No Class Student", "CULS", "SR", 35);


