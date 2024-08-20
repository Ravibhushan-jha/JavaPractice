package Interview.StreamAPI.ComplexOperation;

public class MarkSheet {
    int subjectId;
    int maximumMarksPerSubject;
    int marksObtainByStudent;


    public MarkSheet(int subjectId, int maximumMarksPerSubject, int marksObtainByStudent) {
        this.subjectId = subjectId;
        this.maximumMarksPerSubject = maximumMarksPerSubject;
        this.marksObtainByStudent = marksObtainByStudent;
    }

    public int getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }

    public int getMaximumMarksPerSubject() {
        return maximumMarksPerSubject;
    }

    public void setMaximumMarksPerSubject(int maximumMarksPerSubject) {
        this.maximumMarksPerSubject = maximumMarksPerSubject;
    }

    public int getMarksObtainByStudent() {
        return marksObtainByStudent;
    }

    public void setMarksObtainByStudent(int marksObtainByStudent) {
        this.marksObtainByStudent = marksObtainByStudent;
    }

    @Override
    public String toString() {
        return "MarkSheet{" +
                "subjectId=" + subjectId +
                ", maximumMarksPerSubject=" + maximumMarksPerSubject +
                ", marksObtainByStudent=" + marksObtainByStudent +
                '}';
    }
}
