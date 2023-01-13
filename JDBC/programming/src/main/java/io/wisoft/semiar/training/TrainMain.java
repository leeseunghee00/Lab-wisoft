package io.wisoft.semiar.training;

public class TrainMain {
    public static void main (String[] args) {
        TrainSelectService selectService = new TrainSelectService();
        TrainUpdateService updateService = new TrainUpdateService();
        TrainInsertService insertService = new TrainInsertService();
        TrainDeleteService deleteService = new TrainDeleteService();

        // q1
//        System.out.println("HNU Entertainment의 부서 코드, 이름, 위치를 검색하시오.");
//        selectService.solvQue1();
//        System.out.println();

        // q2
//        System.out.println("HNU Entertainment의 연예관계자 코드, 이름, 관리자, 급여를 검색하시오.");
//        selectService.solvQue2();
//        System.out.println();

        // q3
//        System.out.println("HNU Entertainment(HNU-E)에서 제작한 드라마의 코드와 이름을 검색하시오.");
//        selectService.solvQue3("HNU-E");
//        System.out.println();

        // q4
//        System.out.println("드라마 방영사가 KBC이거나 SBC인 드라마를 검색하시오.");
//        selectService.solvQue4("KBC", "SBC");
//        System.out.println();

        // q5
//        System.out.println("드라마 제작사를 검색하시오. 단, 중복된 값이 있으면 제거하시오");
//        selectService.solvQue5();
//        System.out.println();

        // q6
//        System.out.println("연예관계자들의 급여의 총합과 평균 급여액을 계산하시오.");
//        selectService.solvQue6();
//        System.out.println();

        // q7
//        System.out.println("방영일자가 아직 확정되지 않은 드라마의 이름을 검색하시오.");
//        selectService.solvQue7();
//        System.out.println();

        // q8
//        System.out.println("연예관계자에 대해 연예관계자의 이름과 직속 상사의 이름을 검색하시오.");
//        selectService.solvQue8();
//        System.out.println();

        // q9
//        System.out.println("연예관계자에 대해 이름과 급여를 출력하고, 급여의 내림차순으로 정렬하시오.\n" +
//                "단, 동일 급여일 때는 이름의 오름차순으로 정렬하시오.");
//        selectService.solvQue9();
//        System.out.println();

        // q10
//        System.out.println("모든 연예관계자를 직급별로 그룹화하고,\n" +
//                "평균 급여액이 5000 이상인 직급에 대해 연예 관계자의 직급, 평균 급여액, 최소 급여액, 최대 급여액을 검색하시오");
//        selectService.solvQue10();
//        System.out.println();

        // q11
//        System.out.println("모든 연예관계자의 평균 급여액보다 많은 급여를 받는 연예관계자의 이름과 급여를 검색하라.");
//        selectService.solvQue11();
//        System.out.println();

        // q12
//        System.out.println("방영일자가 확정되지 않은 드라마의 방영일자가 2013-05-01로 편성되었습니다. 알맞게 변경하시오.");
//        updateService.solvQue12("2013-05-01");
//        System.out.println();

        // q13
//        System.out.println("연예관계자 김수현 씨가 대리에서 실장으로 승진하고 급여가 20% 증가 되었습니다. 알맞게 변경하시오.");
//        updateService.solvQue13("김수현", "실장", 1.2);
//        System.out.println();

        // q14
//        System.out.println("우리 회사에 한 명의 임원이 등록되었습니다.\n" +
//                "코드는 E903, 이름은 손진현, 관리자는 E901, 급여는 4000입니다.");
//        insertService.solvQue14("E903", "손진현", "E901", 4000);
//        System.out.println();

        // q15
//        System.out.println("연예관계자인 손진현님이 퇴직했습니다. 연예관계자 목록에서 제거하시오.");
//        deleteService.solvQue15("손진현");
//        System.out.println();

        // 15번 추가 문제
//        System.out.println("15. 배우와 가수를 겸업하는 연예관계자의 이름을 검색하시오.");
//        selectService.solvQue15_1("배우","가수");
//        System.out.println();

        // q16
//        System.out.println("16. 모든 연예관계자 중 직급이 엔터테이너가 아닌 연예관계자의 이름을 검색하라.");
//        selectService.solvQue16("엔터테이너");
//        System.out.println();
    }
}
