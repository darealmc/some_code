import emails

e = new emails()
for(mail in e.mails){
 if(mail.key == 'Michael'){
	println mail.value
 }
}

