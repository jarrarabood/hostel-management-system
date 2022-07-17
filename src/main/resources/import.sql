insert into gender (gender_id, gender_type) values (1000, 'male');
insert into gender (gender_id, gender_type) values (1001, 'female');

insert into hostel (hostel_id, hostel_name, gender_id) values (1000, 'test1', 1000);
insert into hostel (hostel_id, hostel_name, gender_id) values (1001, 'test2', 1001);

insert into room (room_id, hostel_id) values (1000, 1000);
insert into room (room_id, hostel_id) values (1001, 1000);
insert into room (room_id, hostel_id) values (1002, 1000);
insert into room (room_id, hostel_id) values (1003, 1000);
insert into room (room_id, hostel_id) values (1004, 1000);
insert into room (room_id, hostel_id) values (1005, 1000);
insert into room (room_id, hostel_id) values (1006, 1000);
insert into room (room_id, hostel_id) values (1007, 1000);
insert into room (room_id, hostel_id) values (1008, 1000);
insert into room (room_id, hostel_id) values (1009, 1000);
insert into room (room_id, hostel_id) values (1010, 1000);
insert into room (room_id, hostel_id) values (1011, 1000);
insert into room (room_id, hostel_id) values (1012, 1000);
insert into room (room_id, hostel_id) values (1013, 1000);
insert into room (room_id, hostel_id) values (1014, 1000);
insert into room (room_id, hostel_id) values (1015, 1000);
insert into room (room_id, hostel_id) values (1016, 1000);
insert into room (room_id, hostel_id) values (1017, 1000);
insert into room (room_id, hostel_id) values (1018, 1000);
insert into room (room_id, hostel_id) values (1019, 1000);

insert into room (room_id, hostel_id) values (1020, 1001);
insert into room (room_id, hostel_id) values (1021, 1001);
insert into room (room_id, hostel_id) values (1022, 1001);
insert into room (room_id, hostel_id) values (1023, 1001);
insert into room (room_id, hostel_id) values (1024, 1001);
insert into room (room_id, hostel_id) values (1025, 1001);
insert into room (room_id, hostel_id) values (1026, 1001);
insert into room (room_id, hostel_id) values (1027, 1001);
insert into room (room_id, hostel_id) values (1028, 1001);
insert into room (room_id, hostel_id) values (1029, 1001);
insert into room (room_id, hostel_id) values (1030, 1001);
insert into room (room_id, hostel_id) values (1031, 1001);
insert into room (room_id, hostel_id) values (1032, 1001);
insert into room (room_id, hostel_id) values (1033, 1001);
insert into room (room_id, hostel_id) values (1034, 1001);
insert into room (room_id, hostel_id) values (1035, 1001);
insert into room (room_id, hostel_id) values (1036, 1001);
insert into room (room_id, hostel_id) values (1037, 1001);
insert into room (room_id, hostel_id) values (1038, 1001);
insert into room (room_id, hostel_id) values (1039, 1001);

insert into bed_space (bed_space_id, room_id) values (1000, 1000);
insert into bed_space (bed_space_id, room_id) values (1001, 1000);
insert into bed_space (bed_space_id, room_id) values (1002, 1000);
insert into bed_space (bed_space_id, room_id) values (1003, 1000);

insert into bed_space (bed_space_id, room_id) values (1004, 1001);
insert into bed_space (bed_space_id, room_id) values (1005, 1001);
insert into bed_space (bed_space_id, room_id) values (1006, 1001);
insert into bed_space (bed_space_id, room_id) values (1007, 1001);

insert into bed_space (bed_space_id, room_id) values (1008, 1019);
insert into bed_space (bed_space_id, room_id) values (1009, 1019);
insert into bed_space (bed_space_id, room_id) values (1010, 1019);
insert into bed_space (bed_space_id, room_id) values (1011, 1019);

insert into bed_space (bed_space_id, room_id) values (1012, 1030);
insert into bed_space (bed_space_id, room_id) values (1013, 1030);
insert into bed_space (bed_space_id, room_id) values (1014, 1030);
insert into bed_space (bed_space_id, room_id) values (1015, 1030);

insert into student (student_id, full_name, email, bed_space_id, gender_id) values (1000, 'Person1', 'person1@boutiqaat.com', 1000, 1000);
insert into student (student_id, full_name, email, bed_space_id, gender_id) values (1001, 'Person2', 'person2@boutiqaat.com', 1001, 1000);
insert into student (student_id, full_name, email, bed_space_id, gender_id) values (1002, 'Person3', 'person3@boutiqaat.com', 1002, 1000);
insert into student (student_id, full_name, email, bed_space_id, gender_id) values (1003, 'Person4', 'person4@boutiqaat.com', 1003, 1000);

insert into student (student_id, full_name, email, bed_space_id, gender_id) values (1004, 'Person5', 'person5@boutiqaat.com', 1004, 1000);
insert into student (student_id, full_name, email, bed_space_id, gender_id) values (1005, 'Person6', 'person6@boutiqaat.com', 1005, 1000);
insert into student (student_id, full_name, email, bed_space_id, gender_id) values (1006, 'Person7', 'person7@boutiqaat.com', 1006, 1000);
insert into student (student_id, full_name, email, bed_space_id, gender_id) values (1007, 'Person8', 'person8@boutiqaat.com', 1007, 1000);

insert into student (student_id, full_name, email, bed_space_id, gender_id) values (1008, 'Person9', 'person9@boutiqaat.com', 1008, 1001);
insert into student (student_id, full_name, email, bed_space_id, gender_id) values (1009, 'Person10', 'person10@boutiqaat.com', 1009, 1001);
insert into student (student_id, full_name, email, bed_space_id, gender_id) values (1010, 'Person11', 'person11@boutiqaat.com', 1010, 1001);
insert into student (student_id, full_name, email, bed_space_id, gender_id) values (1011, 'Person12', 'person12@boutiqaat.com', 1011, 1001);

insert into student (student_id, full_name, email, bed_space_id, gender_id) values (1012, 'Person13', 'person13@boutiqaat.com', 1012, 1001);
insert into student (student_id, full_name, email, bed_space_id, gender_id) values (1013, 'Person14', 'person14@boutiqaat.com', 1013, 1001);
insert into student (student_id, full_name, email, bed_space_id, gender_id) values (1014, 'Person15', 'person15@boutiqaat.com', 1014, 1001);
insert into student (student_id, full_name, email, bed_space_id, gender_id) values (1015, 'Person16', 'person16@boutiqaat.com', 1015, 1001);