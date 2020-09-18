import React from 'react'
import { Link } from 'react-router-dom'

type Props = {
    link: string
    linkTest: string
}

const Filters = ({ link, linkTest }: Props) => (
<div className="filters-container records-actions">
        <Link  to={link}>
            <button className="action-filters">VER GRÁFICOS</button>
        </Link>
    </div>
)

export default Filters
