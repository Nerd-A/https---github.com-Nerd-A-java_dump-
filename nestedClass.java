class school { 

 

 

    static class grade4 { 

        void TotalAttendance() { 

            System.out.println("Total Attendance of grade4 is 70%"); 

        } 

 

        void TotalMarksAverage() { 

            System.out.println("Average marks of grade4 is 87%"); 

        } 

    } 

      class grade5 { 

        void TotalAttendance() { 

            System.out.println("Total Attendance of grade5 is 90%"); 

        } 

 

        void TotalMarksAverage() { 

            System.out.println("Average marks of grade5 is 67%"); 

        } 

 

 

    } 

} 

 

public class nestedClass { 

    public static void main(String[] args) { 

  school.grade4 g1 = new school.grade4(); 

  g1.TotalAttendance(); 

  g1.TotalMarksAverage(); 

 

  school s1= new school(); 

  school.grade5 g2 = s1.new grade5(); 

  g2.TotalAttendance(); 

  g2.TotalMarksAverage(); 

    } 

} 