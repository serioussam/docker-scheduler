/**
 * This class is generated by jOOQ
 */
package org.paggarwal.dockerscheduler.db.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;
import org.paggarwal.dockerscheduler.db.Dockerscheduler;
import org.paggarwal.dockerscheduler.db.Keys;
import org.paggarwal.dockerscheduler.db.tables.records.QrtzSimpleTriggersRecord;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class QrtzSimpleTriggers extends TableImpl<QrtzSimpleTriggersRecord> {

	private static final long serialVersionUID = 1722613174;

	/**
	 * The reference instance of <code>dockerscheduler.QRTZ_SIMPLE_TRIGGERS</code>
	 */
	public static final QrtzSimpleTriggers QRTZ_SIMPLE_TRIGGERS = new QrtzSimpleTriggers();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<QrtzSimpleTriggersRecord> getRecordType() {
		return QrtzSimpleTriggersRecord.class;
	}

	/**
	 * The column <code>dockerscheduler.QRTZ_SIMPLE_TRIGGERS.SCHED_NAME</code>.
	 */
	public final TableField<QrtzSimpleTriggersRecord, String> SCHED_NAME = createField("SCHED_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(100).nullable(false), this, "");

	/**
	 * The column <code>dockerscheduler.QRTZ_SIMPLE_TRIGGERS.TRIGGER_NAME</code>.
	 */
	public final TableField<QrtzSimpleTriggersRecord, String> TRIGGER_NAME = createField("TRIGGER_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(150).nullable(false), this, "");

	/**
	 * The column <code>dockerscheduler.QRTZ_SIMPLE_TRIGGERS.TRIGGER_GROUP</code>.
	 */
	public final TableField<QrtzSimpleTriggersRecord, String> TRIGGER_GROUP = createField("TRIGGER_GROUP", org.jooq.impl.SQLDataType.VARCHAR.length(150).nullable(false), this, "");

	/**
	 * The column <code>dockerscheduler.QRTZ_SIMPLE_TRIGGERS.REPEAT_COUNT</code>.
	 */
	public final TableField<QrtzSimpleTriggersRecord, Long> REPEAT_COUNT = createField("REPEAT_COUNT", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>dockerscheduler.QRTZ_SIMPLE_TRIGGERS.REPEAT_INTERVAL</code>.
	 */
	public final TableField<QrtzSimpleTriggersRecord, Long> REPEAT_INTERVAL = createField("REPEAT_INTERVAL", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>dockerscheduler.QRTZ_SIMPLE_TRIGGERS.TIMES_TRIGGERED</code>.
	 */
	public final TableField<QrtzSimpleTriggersRecord, Long> TIMES_TRIGGERED = createField("TIMES_TRIGGERED", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * Create a <code>dockerscheduler.QRTZ_SIMPLE_TRIGGERS</code> table reference
	 */
	public QrtzSimpleTriggers() {
		this("QRTZ_SIMPLE_TRIGGERS", null);
	}

	/**
	 * Create an aliased <code>dockerscheduler.QRTZ_SIMPLE_TRIGGERS</code> table reference
	 */
	public QrtzSimpleTriggers(String alias) {
		this(alias, QRTZ_SIMPLE_TRIGGERS);
	}

	private QrtzSimpleTriggers(String alias, Table<QrtzSimpleTriggersRecord> aliased) {
		this(alias, aliased, null);
	}

	private QrtzSimpleTriggers(String alias, Table<QrtzSimpleTriggersRecord> aliased, Field<?>[] parameters) {
		super(alias, Dockerscheduler.DOCKERSCHEDULER, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<QrtzSimpleTriggersRecord> getPrimaryKey() {
		return Keys.KEY_QRTZ_SIMPLE_TRIGGERS_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<QrtzSimpleTriggersRecord>> getKeys() {
		return Arrays.<UniqueKey<QrtzSimpleTriggersRecord>>asList(Keys.KEY_QRTZ_SIMPLE_TRIGGERS_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<ForeignKey<QrtzSimpleTriggersRecord, ?>> getReferences() {
		return Arrays.<ForeignKey<QrtzSimpleTriggersRecord, ?>>asList(Keys.FK_QRTZ_SIMPLE_TRIGGERS_QRTZ_TRIGGERS);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public QrtzSimpleTriggers as(String alias) {
		return new QrtzSimpleTriggers(alias, this);
	}

	/**
	 * Rename this table
	 */
	public QrtzSimpleTriggers rename(String name) {
		return new QrtzSimpleTriggers(name, null);
	}
}
