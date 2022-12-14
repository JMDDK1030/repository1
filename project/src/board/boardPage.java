package board;

public class boardPage {

		public static String pagingStr(int totalCount,  int pageSize, 
				                       int blockPage, int pageNum, String redUrl) {
			
			String pagingStr = "";
			

			int totalPages =  (int)(Math.ceil( (double)totalCount  /  pageSize  )); 
			
			int pageTemp = (((pageNum - 1) / blockPage ) * blockPage) + 1;
			
			System.out.println(pageTemp);
			
			if(pageTemp != 1) {
				
				pagingStr += "<a href='"+  redUrl  +"?pageNum=1'>[첫 페이지]</a>";
				pagingStr += "&nbsp;";
				pagingStr += "<a href='"+  redUrl +"?pageNum="+(pageTemp-1)+"'>[이전 블록]</a>";
			}
			

			int blockCount = 1;
			
			while(blockCount <= blockPage && pageTemp <= totalPages) {
				
				if(pageTemp == pageNum) {
					pagingStr += "&nbsp;" + pageTemp + "&nbsp;";
				}else {
					
					pagingStr += "&nbsp;<a href='"+ redUrl  +"?pageNum=" + pageTemp +"'>"+ pageTemp +"</a>&nbsp;";
					
				}
				
				pageTemp++;
				blockCount++;
				
			}
			
			if(pageTemp <= totalPages) {
				
				pagingStr += "<a href='"+  redUrl  +"?pageNum="+ pageTemp +"'>[다음블록]</a>";
				pagingStr += "&nbsp;";
				pagingStr += "<a href='"+  redUrl +"?pageNum="+totalPages+"'>[마지막페이지]</a>";
				
			}
			
			return pagingStr;
		}

	}


