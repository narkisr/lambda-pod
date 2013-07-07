; @layout page

@(for posts)
# $(date-format date "yyyy MM")
 * [$(title) - $(description)]($(url))
@(end)
