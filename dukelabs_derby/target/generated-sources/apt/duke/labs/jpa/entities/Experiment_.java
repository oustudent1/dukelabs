package duke.labs.jpa.entities;

import java.time.LocalDateTime;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Experiment.class)
public abstract class Experiment_ {

	public static volatile SingularAttribute<Experiment, String> owner;
	public static volatile SingularAttribute<Experiment, String> task;
	public static volatile SingularAttribute<Experiment, LocalDateTime> startTime;
	public static volatile SingularAttribute<Experiment, Integer> id;
	public static volatile SingularAttribute<Experiment, LocalDateTime> endTime;
	public static volatile SingularAttribute<Experiment, Boolean> complete;
	public static volatile CollectionAttribute<Experiment, Measurement> measurements;

	public static final String OWNER = "owner";
	public static final String TASK = "task";
	public static final String START_TIME = "startTime";
	public static final String ID = "id";
	public static final String END_TIME = "endTime";
	public static final String COMPLETE = "complete";
	public static final String MEASUREMENTS = "measurements";

}

