


<% 

for( int i =1 ; i<=10 ; i++) {
	out.println(i);
}

int age = 20;

%>
<br>
<%

if(age>=1 && age<=100) {
	out.println("Valid Age");	
} else {
	out.println("Invalid Age");
}

%>