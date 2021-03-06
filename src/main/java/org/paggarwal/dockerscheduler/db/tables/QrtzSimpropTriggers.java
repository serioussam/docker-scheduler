/**
 * This class is generated by jOOQ
 */
package org.paggarwal.dockerscheduler.db.tables;


import java.math.BigDecimal;
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
import org.paggarwal.dockerscheduler.db.tables.records.QrtzSimpropTriggersRecord;


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
public class QrtzSimpropTriggers extends TableImpl<QrtzSimpropTriggersRecord> {

	private static final long serialVersionUID = -781032552;

	/**
	 * The reference instance of <code>dockerscheduler.QRTZ_SIMPROP_TRIGGERS</code>
	 */
	public static final QrtzSimpropTriggers QRTZ_SIMPROP_TRIGGERS = new QrtzSimpropTriggers();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<QrtzSimpropTriggersRecord> getRecordType() {
		return QrtzSimpropTriggersRecord.class;
	}

	/**
	 * The column <code>dockerscheduler.QRTZ_SIMPROP_TRIGGERS.SCHED_NAME</code>.
	 */
	public final TableField<QrtzSimpropTriggersRecord, String> SCHED_NAME = createField("SCHED_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(100).nullable(false), this, "");

	/**
	 * The column <code>dockerscheduler.QRTZ_SIMPROP_TRIGGERS.TRIGGER_NAME</code>.
	 */
	public final TableField<QrtzSimpropTriggersRecord, String> TRIGGER_NAME = createField("TRIGGER_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(150).nullable(false), this, "");

	/**
	 * The column <code>dockerscheduler.QRTZ_SIMPROP_TRIGGERS.TRIGGER_GROUP</code>.
	 */
	public final TableField<QrtzSimpropTriggersRecord, String> TRIGGER_GROUP = createField("TRIGGER_GROUP", org.jooq.impl.SQLDataType.VARCHAR.length(150).nullable(false), this, "");

	/**
	 * The column <code>dockerscheduler.QRTZ_SIMPROP_TRIGGERS.STR_PROP_1</code>.
	 */
	public final TableField<QrtzSimpropTriggersRecord, String> STR_PROP_1 = createField("STR_PROP_1", org.jooq.impl.SQLDataType.VARCHAR.length(512), this, "");

	/**
	 * The column <code>dockerscheduler.QRTZ_SIMPROP_TRIGGERS.STR_PROP_2</code>.
	 */
	public final TableField<QrtzSimpropTriggersRecord, String> STR_PROP_2 = createField("STR_PROP_2", org.jooq.impl.SQLDataType.VARCHAR.length(512), this, "");

	/**
	 * The column <code>dockerscheduler.QRTZ_SIMPROP_TRIGGERS.STR_PROP_3</code>.
	 */
	public final TableField<QrtzSimpropTriggersRecord, String> STR_PROP_3 = createField("STR_PROP_3", org.jooq.impl.SQLDataType.VARCHAR.length(512), this, "");

	/**
	 * The column <code>dockerscheduler.QRTZ_SIMPROP_TRIGGERS.INT_PROP_1</code>.
	 */
	public final TableField<QrtzSimpropTriggersRecord, Integer> INT_PROP_1 = createField("INT_PROP_1", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>dockerscheduler.QRTZ_SIMPROP_TRIGGERS.INT_PROP_2</code>.
	 */
	public final TableField<QrtzSimpropTriggersRecord, Integer> INT_PROP_2 = createField("INT_PROP_2", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>dockerscheduler.QRTZ_SIMPROP_TRIGGERS.LONG_PROP_1</code>.
	 */
	public final TableField<QrtzSimpropTriggersRecord, Long> LONG_PROP_1 = createField("LONG_PROP_1", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * The column <code>dockerscheduler.QRTZ_SIMPROP_TRIGGERS.LONG_PROP_2</code>.
	 */
	public final TableField<QrtzSimpropTriggersRecord, Long> LONG_PROP_2 = createField("LONG_PROP_2", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * The column <code>dockerscheduler.QRTZ_SIMPROP_TRIGGERS.DEC_PROP_1</code>.
	 */
	public final TableField<QrtzSimpropTriggersRecord, BigDecimal> DEC_PROP_1 = createField("DEC_PROP_1", org.jooq.impl.SQLDataType.DECIMAL.precision(13, 4), this, "");

	/**
	 * The column <code>dockerscheduler.QRTZ_SIMPROP_TRIGGERS.DEC_PROP_2</code>.
	 */
	public final TableField<QrtzSimpropTriggersRecord, BigDecimal> DEC_PROP_2 = createField("DEC_PROP_2", org.jooq.impl.SQLDataType.DECIMAL.precision(13, 4), this, "");

	/**
	 * The column <code>dockerscheduler.QRTZ_SIMPROP_TRIGGERS.BOOL_PROP_1</code>.
	 */
	public final TableField<QrtzSimpropTriggersRecord, Boolean> BOOL_PROP_1 = createField("BOOL_PROP_1", org.jooq.impl.SQLDataType.BIT, this, "");

	/**
	 * The column <code>dockerscheduler.QRTZ_SIMPROP_TRIGGERS.BOOL_PROP_2</code>.
	 */
	public final TableField<QrtzSimpropTriggersRecord, Boolean> BOOL_PROP_2 = createField("BOOL_PROP_2", org.jooq.impl.SQLDataType.BIT, this, "");

	/**
	 * Create a <code>dockerscheduler.QRTZ_SIMPROP_TRIGGERS</code> table reference
	 */
	public QrtzSimpropTriggers() {
		this("QRTZ_SIMPROP_TRIGGERS", null);
	}

	/**
	 * Create an aliased <code>dockerscheduler.QRTZ_SIMPROP_TRIGGERS</code> table reference
	 */
	public QrtzSimpropTriggers(String alias) {
		this(alias, QRTZ_SIMPROP_TRIGGERS);
	}

	private QrtzSimpropTriggers(String alias, Table<QrtzSimpropTriggersRecord> aliased) {
		this(alias, aliased, null);
	}

	private QrtzSimpropTriggers(String alias, Table<QrtzSimpropTriggersRecord> aliased, Field<?>[] parameters) {
		super(alias, Dockerscheduler.DOCKERSCHEDULER, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<QrtzSimpropTriggersRecord> getPrimaryKey() {
		return Keys.KEY_QRTZ_SIMPROP_TRIGGERS_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<QrtzSimpropTriggersRecord>> getKeys() {
		return Arrays.<UniqueKey<QrtzSimpropTriggersRecord>>asList(Keys.KEY_QRTZ_SIMPROP_TRIGGERS_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<ForeignKey<QrtzSimpropTriggersRecord, ?>> getReferences() {
		return Arrays.<ForeignKey<QrtzSimpropTriggersRecord, ?>>asList(Keys.FK_QRTZ_SIMPROP_TRIGGERS_QRTZ_TRIGGERS);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public QrtzSimpropTriggers as(String alias) {
		return new QrtzSimpropTriggers(alias, this);
	}

	/**
	 * Rename this table
	 */
	public QrtzSimpropTriggers rename(String name) {
		return new QrtzSimpropTriggers(name, null);
	}
}
