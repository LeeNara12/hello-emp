
window.addEventListener("load", function(){
	bind();
});

function bind(){
	let btn_all = document.querySelector("#btn_all");
	btn_all.addEventListener("click", function(){
		let xhr = new XMLHttpRequest();
        xhr.open("get", "/api/list");
        xhr.send();

        xhr.onload = function(){
//			console.log(xhr.responseText);

			// �޾ƿ� �����͸� json���� ����
			let data = JSON.parse(xhr.responseText);
//			console.log(data[0].ename);
			
			// ���ϴ� ��ġ(tbody)��
			let tbody = document.querySelector("#tbody");
			
			// ������
			let html = "";
			if(data.length > 0){
				for(let i=0; i<data.length; i++){
					
					// �����͸� ���
					html += "<tr>";
					html += "	<td>"+ data[i].empno +"</td>";
					html += "	<td>"+ data[i].ename +"</td>";
					html += "	<td>"+ data[i].sal +"</td>";
					html += "	<td>"+ data[i].mgr +"</td>";
					html += "	<td>"+ data[i].deptno +"</td>";
					html += "	<td>"+ data[i].dname +"</td>";
					html += "	<td>"+ data[i].loc +"</td>";
					html += "</tr>";
					
				}
			} else {
				html += '<tr>';
				html += '	<td colspan="7" style="text-align:center;">��ȸ�� �����Ͱ� �����ϴ�</td>';
				html += '</tr>';
			}
			
			tbody.innerHTML = html;
			
        }
	
	});
	
}

