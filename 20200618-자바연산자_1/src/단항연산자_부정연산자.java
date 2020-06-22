/*
 *     부정연산자  : !
 *      => boolean일 경우만 사용 ==> true -> false , false -> true
 *      => 결과값 : boolean
 *      
 *         단항 : 
 *              증감 => int
 *              부정 => boolean
 *         이항 :
 *              산술 => ?  계산값에 따라 달라짐
 *                  int + int = int
 *                  double + int = double
 *              비교, 논리 => boolean
 *         삼항 : 
 *         		=> ? 계산값에 따라 달라짐
 *         			sex==1?"남자":"여자"
 *          		sex==1?'M':'W'
 *              
 *         	
 */
public class 단항연산자_부정연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean bCheck=true;
		bCheck=!bCheck; // true의 반대값을 저장  ==> bCheck=false
		bCheck=!bCheck; // bCheck => true
		System.out.println("bCheck="+bCheck);
		// ==> true / false 반복할때 사용

	}

}
