function checkform()		 
		{
			var hovaten = document.getElementById('fullname').value;
			var email = document.getElementById('email').value;
			var phonenumber = document.getElementById('phone').value;
			var x = false;
			
			for (var i = 0; i <document.form2.radio.length; i++)
			{
				if(document.form2.radio[i].checked == true)
				{
					x = true;
				}
			} 
			if ( hovaten == "")
			{
				alert ('Họ và tên không được để trống');
				document.getElementById('fullname').focus();
				return false;
			}
			
			if ( email == "")
			{
				alert ('Email không được để trống');
				document.getElementById('email').focus();
				return false;
			}
			if(isNaN(phonenumber) == true || phonenumber.length < 10 || phonenumber.length >11 )
			{
				alert("Số điện thoại phải là số và có 10-11 ký tự !");
				return false;
			}
			if(email.search("@") == -1)
			{
				alert("Email phải để đúng định dạng nguyenvana@gmail.com");
				return false;
			}
			
				var x =  document.getElementById('days');
				var y =  document.getElementById('months');
				var z =  document.getElementById('years');
				if(x.value == "")
				{
					alert('Bạn phải nhập đầy đủ ngày sinh');
					return false;
				}
				if(y.value == "")
				{
					alert('Bạn phải nhập đầy đủ ngày sinh');
					return false;
				}
				if(z.value == "")
				{
					alert('Bạn phải nhập đầy đủ ngày sinh');
					return false;
				}
			
			alert ('Nhập dữ liệu thành công. Chúc mừng bạn !!!');
			
			
		}