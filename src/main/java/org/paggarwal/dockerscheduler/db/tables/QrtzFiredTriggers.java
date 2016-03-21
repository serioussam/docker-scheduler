/**
 * This class is generated by jOOQ
 */
package org.paggarwal.dockerscheduler.db.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;
import org.paggarwal.dockerscheduler.db.Dockerscheduler;
import org.paggarwal.dockerscheduler.db.Keys;
import org.paggarwal.dockerscheduler.db.tables.records.QrtzFiredTriggersRecord;


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
public class QrtzFiredTriggers extends TableImpl<QrtzFiredTriggersRecord> {

	private static final long serialVersionUID = -1443122600;

	/**
	 * The reference instance of <code>dockerscheduler.QRTZ_FIRED_TRIGGERS</code>
	 */
	public static final QrtzFiredTriggers QRTZ_FIRED_TRIGGERS = new QrtzFiredTriggers();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<QrtzFiredTriggersRecord> getRecordType() {
		return QrtzFiredTriggersRecord.class;
	}

	/**
	 * The column <code>dockerscheduler.QRTZ_FIRED_TRIGGERS.SCHED_NAME</code>.
	 */
	public final TableField<QrtzFiredTriggersRecord, String> SCHED_NAME = createField("SCHED_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(100).nullable(false), this, "");

	/**
	 * The column <code>dockerscheduler.QRTZ_FIRED_TRIGGERS.ENTRY_ID</code>.
	 */
	public final TableField<QrtzFiredTriggersRecord, String> ENTRY_ID = createField("ENTRY_ID", org.jooq.impl.SQLDataType.VARCHAR.length(95).nullable(false), this, "");

	/**
	 * The column <code>dockerscheduler.QRTZ_FIRED_TRIGGERS.TRIGGER_NAME</code>.
	 */
	public final TableField<QrtzFiredTriggersRecord, String> TRIGGER_NAME = createField("TRIGGER_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(150).nullable(false), this, "");

	/**
	 * The column <code>dockerscheduler.QRTZ_FIRED_TRIGGERS.TRIGGER_GROUP</code>.
	 */
	public final TableField<QrtzFiredTriggersRecord, String> TRIGGER_GROUP = createField("TRIGGER_GROUP", org.jooq.impl.SQLDataType.VARCHAR.length(150).nullable(false), this, "");

	/**
	 * The column <code>dockerscheduler.QRTZ_FIRED_TRIGGERS.INSTANCE_NAME</code>.
	 */
	public final TableField<QrtzFiredTriggersRecord, String> INSTANCE_NAME = createField("INSTANCE_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(200).nullable(false), this, "");

	/**
	 * The column <code>dockerscheduler.QRTZ_FIRED_TRIGGERS.FIRED_TIME</code>.
	 */
	public final TableField<QrtzFiredTriggersRecord, Long> FIRED_TIME = createField("FIRED_TIME", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>dockerscheduler.QRTZ_FIRED_TRIGGERS.SCHED_TIME</code>.
	 */
	public final TableField<QrtzFiredTriggersRecord, Long> SCHED_TIME = createField("SCHED_TIME", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>dockerscheduler.QRTZ_FIRED_TRIGGERS.PRIORITY</code>.
	 */
	public final TableField<QrtzFiredTriggersRecord, Integer> PRIORITY = createField("PRIORITY", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>dockerscheduler.QRTZ_FIRED_TRIGGERS.STATE</code>.
	 */
	public final TableField<QrtzFiredTriggersRecord, String> STATE = createField("STATE", org.jooq.impl.SQLDataType.VARCHAR.length(16).nullable(false), this, "");

	/**
	 * The column <code>dockerscheduler.QRTZ_FIRED_TRIGGERS.JOB_NAME</code>.
	 */
	public final TableField<QrtzFiredTriggersRecord, String> JOB_NAME = createField("JOB_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(150), this, "");

	/**
	 * The column <code>dockerscheduler.QRTZ_FIRED_TRIGGERS.JOB_GROUP</code>.
	 */
	public final TableField<QrtzFiredTriggersRecord, String> JOB_GROUP = createField("JOB_GROUP", org.jooq.impl.SQLDataType.VARCHAR.length(150), this, "");

	/**
	 * The column <code>dockerscheduler.QRTZ_FIRED_TRIGGERS.IS_NONCONCURRENT</code>.
	 */
	public final TableField<QrtzFiredTriggersRecord, Boolean> IS_NONCONCURRENT = createField("IS_NONCONCURRENT", org.jooq.impl.SQLDataType.BIT, this, "");

	/**
	 * The column <code>dockerscheduler.QRTZ_FIRED_TRIGGERS.REQUESTS_RECOVERY</code>.
	 */
	public final TableField<QrtzFiredTriggersRecord, Boolean> REQUESTS_RECOVERY = createField("REQUESTS_RECOVERY", org.jooq.impl.SQLDataType.BIT, this, "");

	/**
	 * Create a <code>dockerscheduler.QRTZ_FIRED_TRIGGERS</code> table reference
	 */
	public QrtzFiredTriggers() {
		this("QRTZ_FIRED_TRIGGERS", null);
	}

	/**
	 * Create an aliased <code>dockerscheduler.QRTZ_FIRED_TRIGGERS</code> table reference
	 */
	public QrtzFiredTriggers(String alias) {
		this(alias, QRTZ_FIRED_TRIGGERS);
	}

	private QrtzFiredTriggers(String alias, Table<QrtzFiredTriggersRecord> aliased) {
		this(alias, aliased, null);
	}

	private QrtzFiredTriggers(String alias, Table<QrtzFiredTriggersRecord> aliased, Field<?>[] parameters) {
		super(alias, Dockerscheduler.DOCKERSCHEDULER, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<QrtzFiredTriggersRecord> getPrimaryKey() {
		return Keys.KEY_QRTZ_FIRED_TRIGGERS_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<QrtzFiredTriggersRecord>> getKeys() {
		return Arrays.<UniqueKey<QrtzFiredTriggersRecord>>asList(Keys.KEY_QRTZ_FIRED_TRIGGERS_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public QrtzFiredTriggers as(String alias) {
		return new QrtzFiredTriggers(alias, this);
	}

	/**
	 * Rename this table
	 */
	public QrtzFiredTriggers rename(String name) {
		return new QrtzFiredTriggers(name, null);
	}
}
