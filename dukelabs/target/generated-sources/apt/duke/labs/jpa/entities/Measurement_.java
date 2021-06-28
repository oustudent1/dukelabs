package duke.labs.jpa.entities;

import java.math.BigDecimal;
import java.time.Duration;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Measurement.class)
public abstract class Measurement_ {

	public static volatile SingularAttribute<Measurement, UnitOfMeasure> unit;
	public static volatile SingularAttribute<Measurement, Experiment> experiment;
	public static volatile SingularAttribute<Measurement, Integer> id;
	public static volatile SingularAttribute<Measurement, Duration> time;
	public static volatile SingularAttribute<Measurement, BigDecimal> value;

	public static final String UNIT = "unit";
	public static final String EXPERIMENT = "experiment";
	public static final String ID = "id";
	public static final String TIME = "time";
	public static final String VALUE = "value";

}

